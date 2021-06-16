package com.ekr.dapurbetawi.data;

import com.ekr.dapurbetawi.model.ResepModel;

import java.util.ArrayList;

public class ResepData {

    private static String[] judulMasakan = {
            "Asinan Betawi",
            "Pecak Lele",
            "Gabus Pucung",
            "Semur Jengkol",
            "Soto Betawi",
            "Pindang Bandeng"
    };


    private static String[] gambarResep = {
            "https://www.ngobrolin.id/wp-content/uploads/2019/08/Asinan-Betawi-vs-Asinan-Bogor-Ini-Bedanya-1-asinankartiniali.jpg",
            "https://img-global.cpcdn.com/recipes/a32c69bb8ad94d70/751x532cq70/pecak-lele-khas-betawi-foto-resep-utama.jpg",
            "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2018/12/19/1800380991.jpg",
            "https://pict-b.sindonews.net/dyn/620/pena/news/2021/03/08/185/357622/semur-jengkol-pedas-makanan-betawi-yang-rasa-dan-aromanya-tak-terlupakan-pvg.jpg",
            "https://asset.kompas.com/crops/FJsfTo1_vUpYO-lLGU94wLyIJJ8=/3x0:700x465/750x500/data/photo/2020/06/21/5eef911260b5c.jpg",
            "https://asset.kompas.com/crops/5bC2ugvFO9QasnVVj3qMsuOvbTk=/0x206:360x446/750x500/data/photo/2020/08/14/5f36a00248ba1.jpeg"
    };

    private static String[] kesulitanResep = {
            "Mudah",
            "Mudah",
            "Cukup Rumit",
            "Mudah",
            "Cukup Rumit",
            "Mudah"

    };

    private static String[] waktuResep = {
            "20 Menit",
            "50 Menit",
            "1 Jam",
            "3 Jam",
            "90 Menit",
            "30 Menit"
    };

    private static String[] porsiResep = {
            "6 Porsi",
            "5 Porsi",
            "2 Porsi",
            "6 Porsi",
            "8 Porsi",
            "1-2 Porsi"

    };

    private static String[] bahanResep = {
            //Asinan
            "150 g taoge ukuran sedang\n" +
                    "150 g kol, iris tipis\n" +
                    "6 lembar selada keriting, potong potong\n" +
                    "100 g sawi asin, potong-potong\n" +
                    "100 g timun, bagi 4, potong 1 cm\n" +
                    "30 g kacang tanah, goreng\n" +
                    "100 g tahu putih, potong 1 cm\n" +
                    "60 g kacang tanah, goreng\n" +
                    "5 buah cabai keriting, gorengCek Promo\n" +
                    "100 g gula merah, sisir\n" +
                    "2 sdm air asam jawa\n" +
                    "1 sdt cuka beras\n" +
                    "¾ sdt garam\n" +
                    "250 ml air\n" +
                    "Kerupuk",
            //Pecak Lele
            "Ikan lele, bersihkan - 5 ekor\n" +
                    "Jeruk nipis, ambil air perasannya - 1 buah\n" +
                    "Garam - 1 sdt\n" +
                    "Minyak, untuk menggoreng - secukupnya\n" +
                    "Bawang putih - 3 siung\n" +
                    "Kunyit - 2 cm\n" +
                    "Ketumbar - 1 sdt\n" +
                    "Garam - 1 sdt\n" +
                    "Bawang merah, bakar - 4 butir\n" +
                    "Jahe, bakar - 1 cm\n" +
                    "Cabai rawit - 4 buah\n" +
                    "Cabai merah keriting - 5 buah\n" +
                    "Gula merah, sisir - 1 sdt\n" +
                    "Garam - 3/4 sdt\n" +
                    "Kacang tanah goreng, tumbuk halus - 3 sdm\n" +
                    "Air jeruk nipis - 1 sdm\n" +
                    "Air - 150 ml",
            //Gabus Pucung
            "2 ekor ikan gabus segar\n" +
                    "5 buah pucung (kluwek, keluak)\n" +
                    "2 butir kemiri\n" +
                    "3 buah cabai merah keriting\n" +
                    "3 siung bawang putih\n" +
                    "5 siung bawang merah\n" +
                    "2 kelingking (2 cm) kencur\n" +
                    "1 jempol (2 cm) lenkuas\n" +
                    "1 batang serai, memarkan\n" +
                    "1 lembar daun salam\n" +
                    "2 kelingking (2 cm) kunyit\n" +
                    "Terasi secukupnya\n" +
                    "Garam secukupnya",
            //Semur JEngkol
            "Jengkol - 500 gram\n" +
                    "Tomat - 1 buah\n" +
                    "Kayu manis - 4 cm\n" +
                    "Daun salam - 2 lembar\n" +
                    "Kecap manis (sesuai selera) - 6 sdm\n" +
                    "Bumbu kaldu - 1/2 sdt\n" +
                    "Garam - secukupnya\n" +
                    "Gula - secukupnya\n" +
                    "Bawang merah - 7 siung\n" +
                    "Bawang putih - 4 siung\n" +
                    "Kemiri - 2 butir\n" +
                    "Merica - 1/2 sdt\n" +
                    "Ketumbar - 1 sdt\n" +
                    "Jintan - 1/4 sdt\n" +
                    "Cengkeh - 3 buah\n" +
                    "Biji pala - 1/2 buah",
            //Soto Betawi
            "500 g daging has luar sapi, potong-potong\n" +
                    "5 cm kayu manis\n" +
                    "5 butir cengkih\n" +
                    "5 butir kapulaga\n" +
                    "3 cm lengkuas, memarkan\n" +
                    "3 lembar daun jeruk\n" +
                    "2 lembar daun salam\n" +
                    "200 g paru sapi rebus\n" +
                    "200 g babat rebus\n" +
                    "200 g gajih rebus\n" +
                    "650 ml susu cair\n" +
                    "1 sdm merica bubuk\n" +
                    "2 sdm kaldu jamur\n" +
                    "1 sdt gula pasir\n" +
                    "2 sdm garam\n" +
                    "Bumbu:\n" +
                    "10 butir bawang merah\n" +
                    "4 siung bawang putih\n" +
                    "1 sdt ketumbar\n" +
                    "2 cm jahe\n" +
                    "Pelengkap:\n" +
                    "kentang rebus, potong-potong\n" +
                    "tomat merah, potong-potong\n" +
                    "daun bawang iris halus\n" +
                    "bawang merah goreng\n" +
                    "jaruk nipis\n" +
                    "emping goreng\n" +
                    "sambal rawit",
            //Pindang Bandeng
            "Ikan bandeng, potong 2 bagian - 1 ekor\n" +
                    "Air jeruk nipis - 2 sdm\n" +
                    "Jahe - 7 gram\n" +
                    "Kunyit - 7 gram\n" +
                    "Lengkuas - 7 gram\n" +
                    "Bawang merah - 5 butir\n" +
                    "Bawang putih - 2 siung\n" +
                    "Air asam jawa - 10 ml\n" +
                    "Sereh, digeprek - 1 batang\n" +
                    "Gula palem - 1 sdm\n" +
                    "Garam - secukupnya\n" +
                    "Kaldu ayam bubuk - 1/2 sdm\n" +
                    "Cabe rawit merah - 10 buah\n" +
                    "Tomat merah - 1 buah\n" +
                    "Daun salam - 2 buah\n" +
                    "Daun jeruk - 3 lembar\n" +
                    "Air - 600 ml"

    };

    private static String[] caraResep = {
            //Asinan
            "Bumbu kacang: Haluskan semua bumbu kacang menggunakan blender, sisihkan.\n" +
                    "\n" +
                    "Campurkan bahan sayuran, tuang bumbu bumbu kacang, aduk hingga rata.\n" +
                    "\n" +
                    "Sajikan asinan bersama pelengkap.",
            //Pecak Lele
            "Lumuri ikan lele dengan air perasan jeruk nipis dan garam. Diamkan sesaatkan. Bilas kembali.\n" +
                    "Lumuri ikan lele dengan bumbu halus lalu diamkan selama 15 menit.\n" +
                    "Panaskan banyak minyak. Goreng ikan lele hingga matang. Angkat dan tiriskan. Sisihkan.\n" +
                    "Ulek halus bawang merah, jahe, cabai rawit, cabai merah keriting, gula merah, dan garam.\n" +
                    "Didihkan air dalam panci. Masukkan bumbu halus hasil ulekan di atas. Aduk rata.\n" +
                    "Masukkan kacang tanah halus. Aduk rata.\n" +
                    "Tuang air jeruk nipis. Aduk rata. Koreksi rasanya. Matikan api.\n" +
                    "Taruh ikan lele dalam piring saji. Siram dengan sambal pecak.\n" +
                    "Siap Disajikan",
            //Gabus Pucung
            "Bersihkan ikan gabus. Lumuri dengan air jeruk nipis dan garam.\n" +
                    "Goreng ikan gabus hingga kering dan matang. Tiriskan.\n" +
                    "Kecuali kluwek, serai, dan daun salam, haluskan semua bumbu.\n" +
                    "Tumis bumbu dengan sedikit minyak goreng hingga wangi.\n" +
                    "Tambahkan kluwek, 1 liter air, serai, dan daun salam, lalu rebus sampai mendidih, tambahkan garam seperlunya.\n" +
                    "Siramkan kuah pada ikan gabus goreng.\n" +
                    "Sajikan di pinggan cekung.",
            //Semur Jengkol
            "Rebus jengkol sampai matang selama kurang lebih 2 jam. Buang kulitnya, belah, dan pipihkan. Sisihkan.\n" +
                    "Tumis bumbu halus, kayu manis, dan daun salam sampai harum, kemudian tambahkan air.\n" +
                    "Masukkan jengkol. Tambahkan kecap manis, bumbu kaldu, dan garam.\n" +
                    "Masak hingga empuk, matang, dan kuahnya mengental.",
            //Soto Betawi
            "Didihkan air, rebus daging bersama kayu manis, cengkih, kapulaga dan lengkuas hingga daging empuk.\n" +
                    "Bumbu : Giling bahan bumbu dengan sedikit air hingga halus.\n" +
                    "Tumis bumbu halus hingga wangi dan matang. Masukkan ke dalam rebusan daging.\n" +
                    "Tambahan daun jeruk, daun salam dan serai, masak hingga bumbu meresap.\n" +
                    "Masukkan paru, babat dan gajih sapi.\n" +
                    "Bumbui dengan merica, kaldu bubuk dan garam lalu didihkan kembali.\n" +
                    "Tuangkan susu dan aduk hingga mendidih lalu angkat.\n" +
                    "Penyajian: Susun potongan kentang dan tomat dalam mangkuk saji.\n" +
                    "Tuangi rebusan daging dan jeroan berikut kuah susunya.\n" +
                    "Sajikan dengan taburan daun bawang, bawang goreng, jeruk nipis dan emping serta sambal rawit.",
            //Pindang Bandeng
            "Bersihkan bandeng lalu potong menjadi dua, sisihkan. \n" +
                    "Iris bawang merah dan putih tipis-tipis.\n" +
                    "Sangarai cabe, jahe, kunyit, dan lengkuas. \n" +
                    "Haluskan jahe, laos, kunyit dan cabai.\n" +
                    "Tumis bawang merah dan bawang putih yang sudah diiris hingga wangi Masukan daun salam, sereh, daun jeruk dan air jeruk jeruk. Masak sampai bumbu terlihat matang.\n" +
                    "Tambahkan air dalam tumisan bumbu. Masukan ikan bandeng masak dengan api kecil sekali hingga ikan matang. Sajikan di mangkuk saji."

    };


    public static ArrayList<ResepModel> getListData() {
        ArrayList<ResepModel> list = new ArrayList<>();
        for (int position = 0; position < judulMasakan.length; position++) {
            ResepModel data = new ResepModel();
            data.setJudul(judulMasakan[position]);
            data.setImage(gambarResep[position]);
            data.setDeskripsi(caraResep[position]);
            data.setKesulitan(kesulitanResep[position]);
            data.setWaktu(waktuResep[position]);
            data.setPorsi(porsiResep[position]);
            data.setBahan(bahanResep[position]);
            list.add(data);
        }
        return list;
    }
}
