package com.example.klubhebat;



import java.util.ArrayList;

public class NanangData {
    public static String[][] data = new String[][]{
            {
                    "CHELSEA",
                    "Klub hebat asal Inggris",
                    "https://i.imgur.com/w9HHQvb.png",
                    "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955.",
                    "",
                    ""
            },
            {
                    "BARCELONA",
                    "Klub hebat asal Spanyol",
                    "https://i.imgur.com/dje4o2u.png",
                    "Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\" (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omset tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai $3,56 miliar.[2][3] Lagu kebangsaan resmi Barcelona adalah \"Cant del Barça\", yang ditulis oleh Jaume Picas dan Josep Maria Espinas.",
                    },


            {"JUVENTUS",
                    "Klub hebat asal Italy",
                    "https://i.imgur.com/R1RcjkP.png",
                    "Juventus Football Club S.p.A. (BIT: JUVE) (dari bahasa Latin:[6] iuventus: masa muda [juˈvɛntus]), biasa disebut sebagai Juventus dan popular dengan nama Juve (pengucapan [ˈjuːve]),[7] adalah klub sepak bola profesional Italia yang berbasis di Turin, Piedmont. Klub sepak bola ini adalah yang tertua ketiga di Italia dan telah menghabiskan sebagian besar sejarahnya, dengan pengecualian pada musim 2006–07, di atas klasemen Divisi Pertama (dikenal sebagai Serie A sejak 1929). ",
                    },

            {"FC Bayern München",
                    "Klub hebat asal Jerman",
                    "https://i.imgur.com/DttALOg.png",
                    "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München (pengucapan bahasa Jerman: [ʔɛf ˈt͡seː ˈbaɪ̯ɐn ˈmʏnçən]), FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria. Hal ini terkenal karena tim sepak bola profesional, yang bermain di Bundesliga, peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 29 gelar nasional dan 18 piala nasional."}
    };
    public static ArrayList<Nanang> getListData(){
        Nanang nanang = null;
        ArrayList<Nanang> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            nanang = new Nanang();
            nanang.setName(data[i][0]);
            nanang.setRemarks(data[i][1]);
            nanang.setPhoto(data[i][2]);
            nanang.setDeskripsi(data[i][3]);
            list.add(nanang);
        }

        return list;
    }

}
