package com.oc.ws.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Configuration {

    private String url;
    private String motDepasse;

    public Configuration() throws IOException {
        super();
        MiseAJourDesValeurs();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public void setMotDepasse(String motDepasse) {
        this.motDepasse = motDepasse;
    }

    public void MiseAJourDesValeurs() throws IOException {
        Path path = Paths.get("src/main/resources/config.properties");
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

        for (int ln = 0; ln <=1; ln++) {
            if ((tableauDetableau[ln][0]).equalsIgnoreCase("Serveur.url ")) {

				/*int url = (Integer.parseInt(tableauDetableau[ln][1]));
				String urlS = String.valueOf(url);*/
                setUrl(tableauDetableau[ln][1]);
            }

            if ((tableauDetableau[ln][0]).equalsIgnoreCase("Base.De.donnee ")) {
                setMotDepasse(tableauDetableau[ln][1]);
            }

        }
    }
}
