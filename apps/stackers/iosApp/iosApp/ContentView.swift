import UIKit
import SwiftUI
import shared

struct StackersView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        StackersViewControllerKt.StackersAppController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
        StackersView()
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .ignoresSafeArea(.all)
    }
}



