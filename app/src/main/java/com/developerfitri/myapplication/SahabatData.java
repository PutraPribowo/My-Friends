package com.developerfitri.myapplication;

import java.util.ArrayList;

public class SahabatData {

    public static String[][] data = new String[][]{
            {"Putra" , "Orang yang disayang" , "Pernah sayang tapi sekarang gak tahu karena perasaan yang selalu berubah-ubah, tapi pasti ada sedikit rasa sayang walaupun tidak besar." , "https://4.bp.blogspot.com/_fMyr5O5j0Ag/Sz38OGl465I/AAAAAAAAAow/YdrttB076LY/s1600/cowok+jatuh+cinta.jpg"},
            {"Laila", "Mak Cerewet", "Merupakan sosok sahabat yang cerewet tapi dia sayang sama aku pokoknya, dia juga diajak taaruf sama orang bandung loh" , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"},
            {"Cedal" , "Senyum" , "Sahabat yang selalu buat aku tertawa deh sama dia." , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"},
            {"Nabila", "Tercengeng", "Orangnya lucu dan dia juga pintar." , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"},
            {"Eva", "Tergalak", "Orangnya Galak sama aku, tapi dia sayang sama aku loh." , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"},
            {"Sherly", "Terserius", "Orangnya punya target dan dia selalu cerita tentang cwoknya anak tkj itu yang katanya bikin hatinya terbang." , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"},
            {"Fitri", "Terimut dan Termanis", "Anak Sekarang Mahasiswi UIN Lampung, aku diajak sama seseorang laki-laki untuk belajar yang tak pernah aku tahu. Dia sekarang jauh dengan diriku, tapi ya udah aku udah menemukan cowok idamanku hehe..." , "https://4.bp.blogspot.com/-CjA2BLABz40/TZYSIixFR8I/AAAAAAAAAD0/iZ-76EO0EZ0/s1600/picasabackground.jpg"}
    };

    public static ArrayList<Sahabat> getListData(){
        Sahabat keluarga = null;
        ArrayList<Sahabat> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            keluarga = new Sahabat();
            keluarga.setName(data[i][0]);
            keluarga.setStatus(data[i][1]);
            keluarga.setDetail(data[i][2]);
            keluarga.setPhoto(data[i][3]);

            list.add(keluarga);
        }

        return list;
    }
}

