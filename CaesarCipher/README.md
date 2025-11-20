# CaesarCipher-Java

A simple and educational implementation of the **Caesar Cipher** in Java.  
This project is part of the main repository **Cryptography**, which includes multiple mini cryptography tools to build foundational intuition about encryption, decryption, and brute-force attacks.

---

## 🔐 About This Project

The Caesar Cipher is one of the oldest and simplest encryption techniques.  
Although it's insecure by modern standards, it’s perfect for learning:

- Key-based encryption  
- Modular arithmetic  
- Brute-force key search  
- Basic cryptanalysis mindset  

This Java version offers:

- **Encrypt** plaintext with a shift (0–25)  
- **Decrypt** ciphertext with a known shift  
- **Brute-force** all possible keys  

---

## 🧠 Features

- Converts input to uppercase and filters only `A–Z`  
- Handles wrap-around using `(index + shift) % 26`  
- Single-file solution (`CaesarCipher.java`)  
- Fully interactive console menu  
- Works on all Java versions 8+  

---

## ▶️ How to Run

### Compile
```bash
javac CaesarCipher.java
```

### Run
```bash
java CaesarCipher
```

---

## 📌 Example Usage

### Encryption
Input:
```
Plaintext: I CAN ENCRYPT
Shift: 15
```

Output:
```
Ciphertext: XRPCTCRGNEI
```

---

### Decryption
Input:
```
Ciphertext: XRPCTCRGNEI
Shift: 15
```

Output:
```
Plaintext: ICANENCRYPT
```

---

### Brute-force Mode
Input:
```
Ciphertext: XRPCTCRGNEI
```

Output (excerpt):
```
Shift  0: XRPCTCRGNEI
Shift  1: WQOBSBQFMDH
...
Shift 15: ICANENCRYPT
...
```

---

## 🧩 File Structure

```
CaesarCipher-Java/
├── CaesarCipher.java
├── README.md
└── LICENSE
```

---

## 📚 Educational Insight

This project teaches:

- How classical ciphers operate  
- Why small key spaces are insecure  
- How brute-force attacks work  
- Why modern cryptography moved to huge key sizes  

---

## 🚀 Future Expansions

Inside the main **Cryptography** repo:

- Vigenère Cipher (Java)  
- XOR Cipher demo  
- Frequency analysis tool  
- Hashing playground (SHA-256)  

---

## 📜 License

Licensed under the MIT License.  
See the **LICENSE** file for details.
