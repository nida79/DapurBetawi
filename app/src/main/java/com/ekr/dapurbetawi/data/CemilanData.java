package com.ekr.dapurbetawi.data;

import com.ekr.dapurbetawi.model.CemilanModel;
import com.ekr.dapurbetawi.model.ResepModel;

import java.util.ArrayList;

public class CemilanData {

    private static String[] judulMasakan = {
            "Kue Cincin",
            "Kolang-Kaling",
            "Kue Dongkal",
            "Kerak Telor",
            "Kue Ongol Ongol"

    };


    private static String[] gambarResep = {
        "https://img-global.cpcdn.com/recipes/950102363bc37b15/1360x964cq70/kue-cincin-betawi-mm-anna-foto-resep-utama.webp",
        "https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/2019/05/14/442826626.jpg",
        "https://www.tagar.id/Asset/uploads/804245-dongkal.jpeg",
         "https://asset.kompas.com/crops/0zuG8hpxvAzX0BxNUz6tTbGQtFI=/123x9:1377x844/750x500/data/photo/2019/10/12/5da1e00ddbc6b.jpg",
          "https://img-global.cpcdn.com/recipes/e23d195a5853d5aa/1200x630cq70/photo.jpg"
    };

    private static String[] kesulitanResep = {
            "Cukup Sulit",
            "Mudah",
            "Mudah",
            "Cukup Sulit",
            "Mudah"


    };

    private static String[] waktuResep = {
            "1 Hari Lebih 1 Jam",
            "50 Menit",
            "1 Jam",
            "45 Menit",
            "1 Jam 20 Menit"

    };

    private static String[] porsiResep = {
            "30 Pcs",
            "3-4 Porsi",
            "3-4 Porsi",
            "6 Porsi",
            "1 Porsi"

    };

    private static String[] bahanResep = {
            //Kue Cincin
            "Kelapa setengah tua sebanyak 100 gram (di kupas, parut dan di sangrai)\n" +
                    "Gula merah sebanyak 75 gram\n" +
                    "Air bersih sebanyak 125 ml\n" +
                    "Tepung beras sebanyak 250 gram\n" +
                    "Gula pasir sebanyak 75 gram\n" +
                    "Garam dapur sebanyak ¼ sendok teh\n" +
                    "Minyak goreng secukupnya",
            //Kolang Kaling
            "500 gr Kolang Kaling\n" +
                    "7 sdm gula pasir (bisa lebih atau kurang, tergantung selera)\n" +
                    "250 ml Fanta merah, saya pakai yang botol kecil\n" +
                    "1 helai daun pandan\n" +
                    "2 lebar daun jeruk\n" +
                    "4 tetes pewarna makanan merah\n" +
                    "Air cucian beras untuk merendam kolang kaling\n" +
                    "1/2 sdt garam",
            //Dongkal
            " 150 gr gula merah\n" +
                    " Kelapa parut kukus\n" +
                    " 1 lembar daun pandan\n" +
                    " 1 sdt garam\n" +
                    " 200 gr kelapa parut muda\n" +
                    " 300 gr tepung beras\n" +
                    " 1 sdt vanili\n" +
                    " Minyak goreng",
            //Kerak Telor
            "100Gr beras ketan putih, rendam semalaman\n" +
                    "6 Butir Telur bebek\n" +
                    "1sdt Royco Kaldu Ayam\n" +
                    "250 ml air\n" +
                    "30 gr bawang merah goreng\n" +
                    "2 sdm minyak sayur\n" +
                    "3 Buah cabar merah keriting\n" +
                    "1 cm jahe\n" +
                    "3 cm kencur\n" +
                    "1/2 sdt merica putih bubuk\n" +
                    "150 gr kelapa parut kasar, sangrai\n" +
                    "1 sdm Kecap manis\n" +
                    "1 sdm bawang merah goreng",
            //ongol ongol
            "500 gr Gula Merah (sisir halus)\n" +
                    "150 gr Gula Pasir\n" +
                    "375 cc Air Putih\n" +
                    "100 gr Tepung Sagu\n" +
                    "375 cc Air\n" +
                    "500 gr Tepung Sagu\n" +
                    "375 cc Air\n" +
                    "1 Butir Kelapa Parut\n" +
                    "1/2 Sdt Garam Halus\n" +
                    "2 Lembar Daun Pandan"
    };

    private static String[] caraResep = {
            //Kue Cincin
            "Siapkan wadah untuk merebus gula merah dan air bersih, rebus hingga mendidih dan gula merah larut.\n" +
                    "Kemudian saring gula merah cair tersebut dan masukan dalam tepung beras sambil diaduk hingga rata.\n" +
                    "Setelah itu masukan sangrai kelapa sambil diaduk rata.\n" +
                    "Masukan pula gula pasir dan garam dapur aduk kembali hingga benar-benar tercampur rata.\n" +
                    "Uleni dengan menggunakan tangan hingga kalis dan adonan tidak lengket.\n" +
                    "Diamkan dahulu selama 1 malam penuh.\n" +
                    "Berikutnya ambil adonan secukupnya dan bentuk seperti cincin.\n" +
                    "Lalukan seperti itu terus hingga adonan habis.\n" +
                    "Ambil wajan dan panaskan minyak di atasnya kemudian goreng adonan yang telah dibentuk sampai berwarna kuning kecoklatan atau hingga matang.\n" +
                    "Angkat dan tiris-kan dahulu. Biarkan dingin lalu siap untuk dihidangkan.",
            //Kolang Kaling
            "Cuci bersih kolang kaling, lalu rendam dengan air cucian beras. Diamkan selama 1 jam. Setelah di rendam, bilas, lalu sisihkan.\n"+
                    "Siapkan panci, masukkan semua bahan dan aduk perlahan dengan api kecil selama 35-45 menit atau sampai air surut tetapi tidak habis airnya.\n"+
                    "Taruh kolang kaling dalam wadah, angin-angin kan hingga dingin lalu masukkan ke dalam kulkas. Lebih enak dinginkan dalam kulkas selama 3-4 jam. Selamat mencoba\n",
            //Dongkal
            "Pertama, kukus tepung beras selama 15 menit, setelah itu angkat dan dinginkan.\n" +
                    "Selanjutnya, campurkan dalam wadah tepung beras, 200 gr kelapa muda, vanili, dan garam. Uleni hingga kalis.\n" +
                    "Setelah itu, ambil cetakan kue bolu kukus, lumuri dengan minyak goreng secukupnya.\n" +
                    "Kemudian, masukan adonan dalam cetakan sampai setengah bagian, berikan irisan gula merah, lalu tutup kembali dengan adonan. Lakukan secara berulang hingga berlapis.\n" +
                    "Tambahkan daun pandan dan kukus selama 45 menit atau sampai matang.\n" +
                    "Nah, tinggal berikan taburan kelapa kukus dan sajikan selagi hangat",
            //Kerak Telur
            "Panaskan minyak di atas api sedang. Tumis bumbu halus hingga harum. Tambahkan 1 sdt Royco Kaldu Ayam. Angkat, sisihkan.\n" +
                    "Panaskan wajan cekung. Masukkan 3 sdm beras ketan putih. Siram dengan 2 sdm air rendaman beras. Biarkan hingga setengah kering.\n" +
                    "Letakkan satu butir telur bebek di atas beras ketan yang tengah dimasak. Tambahkan 1 sdt bumbu halus dan bawang merah goreng.\n" +
                    "Aduk rata telur dan bumbu di atas beras ketan, lalu\n" +
                    "tutup sesaat hingga matang. Balik wajan di atas api. Masak hingga matang. Angkat. Ulangi hingga bahan habis.\n" +
                    "Hidangkan kerak telor di atas piring saji dengan bubuhan Bango Kecap Manis dan taburan kelapa parut (serundeng) serta bawang merah goreng.",
            //Ongol Ongol
            "Larutkan tepung sagu dengan 125 cc Air (dari 375 cc Air) sementara itu masak air sisanya ± 250 cc Air hingga mendidih. Masukan larutan sagu, masak terus sambil diaduk hingga adonan menyerupai lem.\n" +
                    "Masak sampai mendidih gula Merah, gula pasir dan 375 cc air hingga gula larut, angkat dan biarkan dingin.\n" +
                    "Tuang Larutan Sagu kedalam larutan gula, sedikit demi sedikit sambil diaduk hingga rata.\n" +
                    "Larutkan 500 gr Sagu dengan air 375 cc Air, kemudian masukan ke dalam campuran gula dan larutan sagu seperti lem saring. Sisihkan.\n" +
                    "Tuang adonan dalam loyang, kukus selama 1 jam (jangan dibuka buka) masak hingga matang, angkat potong-potong.\n" +
                    "Campur kelapa parut, garam dan daun pandan. Kemudian kukus hingga matang, lalu angkat.\n" +
                    "Guling2kan potongan Ongol-ongol dikelapa parut. Hidangkan"

    };


    public static ArrayList<CemilanModel> getListData() {
        ArrayList<CemilanModel> list = new ArrayList<>();
        for (int position = 0; position < judulMasakan.length; position++) {
            CemilanModel data = new CemilanModel();
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
