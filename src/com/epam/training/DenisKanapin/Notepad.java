/*
 *  @(#)Notepad.java        v.1.00 16/03/21
 * 
 * Copyright (c) 
 */
package com.epam.training.DenisKanapin;

/**
 * 
 * Класс предназначен для хранения строковых данных.
 * Он поддерживает методы добавления, удаления и редактирования
 * записи. Так же можно просмотреть все имеющиеся записи.
 * 
 * @version 1.0
 * 
 * @author DenisKanapin
 *
 */
public class Notepad {
	
	/**Массив строк, который хранит все добавления. */
	private String[] data;
	
	/**Счетчик для массива строк. */
	private int      counter;
	
	/**Конструктор блокнота. Инициализирует массив строк
	 * на 10 элементов по умолчанию.
	 */
	public Notepad() {
		this.data = new String[10];
	}
    
	/** Проверяет хватает ли места в {@link Notepad#data String[] data}. 
	 * Если нет, увеличивает в 2 раза. Добавляет запись
	 * в {@link Notepad#data String[] data}. 
	 * Обновляет {@link Notepad#counter counter}. 
	 * 
	 * @param str добавляемая строка в блокнот.
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
	 * Удаляет первую эквивалентную запись из блокнота
	 * заменив её null-ом.Остальные остаются. 
	 * 
	 * @param delRec удаляемая запись из блокнота.
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
	 * Заменяет первую эквивалентную запись oldRec на newRec.
	 * Остальные остаются. 
	 * 
	 * @param oldRec старая запись.
	 * @param newRec новая запись.
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
	 * Возвращает все записи из {@link Notepad#data String[] data}
	 * не равные null в виде строки. 
	 * 
	 * @return Строка состоящая из массива строк {@link Notepad#data String[] data}.
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
