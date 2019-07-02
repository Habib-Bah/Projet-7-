package com.opendevup.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Configuration {

	private int frequence;
	private int frequence2;

	public Configuration() throws IOException {
		super();
		MiseAJourDesValeurs();
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public int getFrequence2() {
		return frequence2;
	}

	public void setFrequence2(int frequence2) {
		this.frequence2 = frequence2;
	}

	public void MiseAJourDesValeurs() throws IOException {
		Path path = Paths.get("Ressources/config.properties");
		String tab[] = new String[2];

		int i = 0;

		for (String lignes : Files.readAllLines(path)) {
			tab[i] = lignes;
			i++;
		}

		String[] tab1 = tab[0].split(": ");
		String[] tab2 = tab[1].split(": ");

		String tableauDetableau[][] = new String[2][2];

		tableauDetableau[0] = tab1;
		tableauDetableau[1] = tab2;

		for (int ln = 0; ln <= 1; ln++) {
			if ((tableauDetableau[ln][0]).equalsIgnoreCase("Frequence.envoie.rappel ")) {

				setFrequence((Integer.parseInt(tableauDetableau[ln][1])));

			}

			if ((tableauDetableau[ln][0]).equalsIgnoreCase("Frequence.envoie.rappel2 ")) {

				setFrequence2((Integer.parseInt(tableauDetableau[ln][1])));

			}
		}

	}
}
