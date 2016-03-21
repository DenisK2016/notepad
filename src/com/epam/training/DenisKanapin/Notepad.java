/*
 *  @(#)Notepad.java        v.1.00 16/03/21
 * 
 * Copyright (c) 
 */
package com.epam.training.DenisKanapin;

/**
 * 
 * ����� ������������ ��� �������� ��������� ������.
 * �� ������������ ������ ����������, �������� � ��������������
 * ������. ��� �� ����� ����������� ��� ��������� ������.
 * 
 * @version 1.0
 * 
 * @author DenisKanapin
 *
 */
public class Notepad {
	
	/**������ �����, ������� ������ ��� ����������. */
	private String[] data;
	
	/**������� ��� ������� �����. */
	private int      counter;
	
	/**����������� ��������. �������������� ������ �����
	 * �� 10 ��������� �� ���������.
	 */
	public Notepad() {
		this.data = new String[10];
	}
    
	/** ��������� ������� �� ����� � {@link Notepad#data String[] data}. 
	 * ���� ���, ����������� � 2 ����. ��������� ������
	 * � {@link Notepad#data String[] data}. 
	 * ��������� {@link Notepad#counter counter}. 
	 * 
	 * @param str ����������� ������ � �������.
	 */
	public void addRecord(String str) {
		String[] data2;
		
		if (counter > (data.length - 1)) {
			data2 = new String[data.length * 2];
			for (int i = 0; i < data.length; i++) {
				data2[i] = data[i];
			}
			data = data2;
		}
		
		data[counter] = str;
		counter++;
	}
	
	/** 
	 * ������� ������ ������������� ������ �� ��������
	 * ������� � null-��.��������� ��������. 
	 * 
	 * @param delRec ��������� ������ �� ��������.
	 */
	public void deleteRecord(String delRec) {
		for (int i = 0; i < data.length; i++) {
			if ((data[i] != null) && (data[i].equals(delRec))) {
				data[i] = null;
				break;
			}
		}
	}
	
	/** 
	 * �������� ������ ������������� ������ oldRec �� newRec.
	 * ��������� ��������. 
	 * 
	 * @param oldRec ������ ������.
	 * @param newRec ����� ������.
	 */
	public void setRecord(String oldRec, String newRec) {
		for (int i = 0; i < data.length; i++) {
			if ((data[i] != null) && (data[i].equals(oldRec))) {
				data[i] = newRec;
				break;
			}
		}
	}
	
	/** 
	 * ���������� ��� ������ �� {@link Notepad#data String[] data}
	 * �� ������ null � ���� ������. 
	 * 
	 * @return ������ ��������� �� ������� ����� {@link Notepad#data String[] data}.
	 */
	public String getRecords() {
		String str = "";
		
		for (String s : data) {
			if (s != null) {
				str += (s + "\n");
			}
		}
		return str;
	}
}
