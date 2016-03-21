/*
 *  @(#)WriteToNotepad.java        v.1.00 16/03/21
 * 
 * Copyright (c) 
 */
package com.epam.training.DenisKanapin;

/**
 * 
 * ����� ������ ������ � {@link Notepad#Notepad Notepad} � ����������� ��.
 * 
 * @version 1.0
 * 
 * @author DenisKanapin
 *
 */
public class WriteToNotepad {
	
	/**
	 * ������� ����� ��� ���������� ���������.
	 * ������� ��������� {@link Notepad#Notepad Notepad}.
	 * ���������� ���� ������, �������, �����������, ������� �� �� �����.
	 * 
	 *  @param args ������ ����������� ������ main.
	 */
	public static void main(String[] args) {
		Notepad note = new Notepad();
		
		note.addRecord("Record111");
		note.addRecord("Record222");
		note.addRecord("Record333");
		note.addRecord("Record444");
		note.addRecord("Record555");
		note.addRecord("Record666");
		note.addRecord("Record777");
		note.addRecord("Record888");
		note.addRecord("Record999");
		note.addRecord("Record101010");
		note.addRecord("Record111111");
		System.out.println(note.getRecords());
		
		note.deleteRecord("Record333");
		note.deleteRecord("Record444");
		note.deleteRecord("Record555");
		System.out.println(note.getRecords());
		
		note.setRecord("Record111", "Record333");
		note.setRecord("Record222", "Record444");
		note.setRecord("Record666", "Record555");
		System.out.println(note.getRecords());
	}
}
