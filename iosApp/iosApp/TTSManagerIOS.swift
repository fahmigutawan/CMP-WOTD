import Foundation
import ComposeApp
import AVFoundation

class TTSManagerIOS: NSObject, ComposeApp.TTSProvider, AVSpeechSynthesizerDelegate {
    static let shared = TTSManagerIOS()
    private let synthesizer = AVSpeechSynthesizer()

    private var onStartCallback: (() -> Void)?
    private var onCompleteCallback: (() -> Void)?

    override private init() {
        super.init()
        synthesizer.delegate = self
    }

    func initialize(
        onSuccess: @escaping () -> Void,
        onFailed: @escaping () -> Void
    ) {
        onFailed()
    }

    func speak(
        text: String,
        onStart: @escaping () -> Void,
        onComplete: @escaping () -> Void
    ) {
        self.onStartCallback = onStart
        self.onCompleteCallback = onComplete

        let utterance = AVSpeechUtterance(string:text)
        utterance.voice = AVSpeechSynthesisVoice(language: "en-EN")

        synthesizer.speak(utterance)
    }

    func speechSynthesizer(
        _ synthesizer: AVSpeechSynthesizer,
        didStart utterance: AVSpeechUtterance
    ) {
        onStartCallback?()
    }

    func speechSynthesizer(
        _ synthesizer: AVSpeechSynthesizer,
        didFinish utterance: AVSpeechUtterance
    ) {
        onCompleteCallback?()
    }
}
