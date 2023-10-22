package org.example;

import org.example.notes.Note;
import org.example.notes.NoteManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteManager noteManager = new NoteManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String inputNote = scanner.nextLine();

        Note note = new Note(inputNote);
        noteManager.addNote(note);

        System.out.println("Дозапись в файл: " + note.getFormattedTimestamp() + " -> " + inputNote);

        noteManager.saveNotesToFile("notes.txt");
    }
}