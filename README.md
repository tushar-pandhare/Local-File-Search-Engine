# Local File Search Engine

This project is a Local File Search Engine implemented in Java. It scans files from the local file system, extracts textual content from multiple file formats, builds an inverted index, and performs fast keyword-based search retrieval.

The project is designed to demonstrate concepts related to:

* Data Structures & Algorithms
* Inverted Indexing
* File System Traversal
* Parser Abstraction
* Search Engine Fundamentals
* Modular Backend Design

## Features

* Recursive file scanning
* Fast keyword-based file search
* Inverted index implementation
* Multi-format file support
* PDF text extraction using Apache PDFBox
* Tokenization and normalization
* Modular parser architecture
* Extensible design for additional file types

## Supported File Types

* TXT
* JAVA
* JSON
* XML
* CSV
* PDF

## Project Structure

```text id="9jqk1r"
LocalFileSearchEngine/
│
├── libs/
│   └── pdfbox-app-3.0.7.jar
│
├── out/
│
└── src/
    │   Main.java
    │
    ├── data/
    │   └── documents/
    │
    ├── parser/
    ├── scanner/
    ├── index/
    ├── search/
    ├── ranking/
    └── utils/
```

## Usage

To use this project, follow these steps:

Clone the repository to your local machine.

Navigate to the project directory.

Compile the project using the following command:

```powershell id="a6i7xt"
$files = Get-ChildItem -Recurse -Filter *.java src
javac -cp "libs/pdfbox-app-3.0.7.jar" -d out $files.FullName
```

Once the project is compiled, run the application using:

```powershell id="j4r2ny"
java -cp "out;libs/pdfbox-app-3.0.7.jar" Main
```

Enter a search keyword when prompted.

Example:

```text id="6mzgh3"
Search Query:
java
```

The engine will return matching files containing the searched keyword.

## How It Works

1. The scanner recursively traverses files from the target directory.
2. ParserFactory selects the appropriate parser based on file type.
3. The parser extracts textual content from the file.
4. Tokenizer normalizes and splits text into searchable tokens.
5. Tokens are stored inside an inverted index.
6. Search queries retrieve matching files efficiently.

## Technologies Used

* Java
* Java NIO
* Collections Framework
* Apache PDFBox

