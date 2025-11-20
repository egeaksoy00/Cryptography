# VigenereCipher-Java

A full Java implementation of the **Vigenère Cipher**, including:

- Standard encryption  
- Standard decryption  
- **Visualization Mode** (step-by-step encryption table)  

This project is part of the main **Cryptography** repository.

---

## 🔐 What Is the Vigenère Cipher?

The Vigenère Cipher is a classical **polyalphabetic substitution cipher**.  
Unlike Caesar Cipher (which applies a single shift), Vigenère uses:

- A **keyword** (e.g., `LEMON`)
- Each letter of the keyword represents a shift (`L=11`, `E=4`, …)
- The key is **repeated** to match the length of the plaintext

This makes it significantly stronger than Caesar and an excellent introduction to true cryptography concepts.

---

## ✨ Features

- Automatic text normalization (A–Z only)
- Automatic key normalization
- Key extension to match plaintext length
- Encryption using textbook formula:
  ```
  C[i] = (P[i] + K[i]) mod 26
  ```
- Decryption using:
  ```
  P[i] = (C[i] - K[i] + 26) mod 26
  ```
- **Visualization Mode**:  
  Displays a detailed table showing:
  - Position  
  - Plaintext letter  
  - Plaintext index  
  - Key letter  
  - Key index  
  - Resulting ciphertext letter  

This makes the algorithm fully transparent—excellent for learning.

---

## ▶️ How to Run

### 1. Compile
```bash
javac VigenereCipher.java
```

### 2. Run
```bash
java VigenereCipher
```

You will see a menu:

```
=== Vigenere Cipher Tool (Java) ===
1) Encrypt
2) Decrypt
3) Encrypt with visualization
4) Exit
```

---

## 🧪 Example (Visualization Mode)

Plaintext:
```
ATTACK AT DAWN!
```

Key:
```
LEMON
```

Visualization output shows:

- Normalized plaintext: `ATTACKATDAWN`
- Extended key: `LEMONLEMONLE`
- Full encryption table:

```
Pos   P     P#    K     K#    C
-------------------------------------
0     A     0     L     11    L
1     T     19    E     4     X
2     T     19    M     12    F
3     A     0     O     14    O
...
```

Final ciphertext:
```
LXFOPVEFRNHR
```

---

## 📚 Educational Benefits

This project helps you understand:

- Polyalphabetic substitution  
- Key repetition and alignment  
- Why Vigenère is stronger than Caesar Cipher  
- Modulo arithmetic in cryptography  
- Encryption vs. decryption symmetry  
- Step-by-step cryptographic visualization  

---

## 🔜 Possible Extensions

- Automatic key length estimation (Friedman Test / Kasiski Method)  
- Frequency analysis attack mode  
- Support for preserving spaces/punctuation  
- Add a GUI version (JavaFX or Swing)  

---

## 📜 License

This project uses the MIT License (same as the main repository).
