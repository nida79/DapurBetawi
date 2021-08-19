package com.ekr.dapurbetawi.data;

import com.ekr.dapurbetawi.model.RestoModel;

import java.util.ArrayList;

public class RestoData {

    private static String[] namaResto = {
            "Kafe Betawi",
            "Soto Betawi H.Husein",
            "Kembang Goela",
            "Warung Betawi H. Muhayar",
            "Nasi Uduk Gondangdia",
            "Gado Gado Cemara"



    };


    private static String[] gambarResto = {
           "https://media-cdn.tripadvisor.com/media/photo-s/09/75/85/fb/kafe-betawi.jpg",
            "https://akcdn.detik.net.id/community/media/visual/2018/08/23/791790f8-386f-49a6-9fc6-c1165e7b8bd1.jpeg?a=1",
          "https://myvenue.id/wp-content/uploads/2020/09/Kembang-goela.png",
             "https://ik.imagekit.io/tvlk/cul-asset/guys1L+Yyer9kzI3sp-pb0CG1j2bhflZGFUZOoIf1YOBAm37kEUOKR41ieUZm7ZJ/tvlk-prod-cul-assets/culinary/asset/REST_201-960x720-FIT_AND_TRIM-059efdd9d3971dbf081df0171a30d3a5.jpeg?tr=q-40,c-at_max,w-1080,h-1920&_src=imagekit",
            "https://b.zmtcdn.com/data/pictures/5/7404745/65a525e8f5d5deebe56ba62ff0940f7c.jpg",
            "https://cdn.idntimes.com/content-images/community/2019/10/49368872-335025867337493-7707037963421556103-n-d6f91433a627073b69c8d192872e68cd.jpg"


    };

    private static String[] alamatResto = {

          "Kota Kasablanka Lantai UG Unit 11, Jalan Casablanca Kav. 88, Menteng Dalam, RT.16/RW.5, Menteng Dalam, Kec. Tebet," +
                  " Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12870",

            "Jl. Padang Panjang No. 6C Pasar Manggis Setiabudi Jakarta Selatan DKI Jakarta 8 8, RT.8/RW.8, Ps. Manggis, " +
                    "Kecamatan Setiabudi, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12850",

            "Jl. Jend. Sudirman No.Kav. 47-48, RT.5/RW.4, Karet Semanggi, Kecamatan Setiabudi, Kota Jakarta Selatan, " +
                    "Daerah Khusus Ibukota Jakarta 12920",
            " Jl. Taman Margasatwa Raya No.8, RT.9/RW.5, Jati Padang, Kec. Ps. Minggu, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12540",

            "Jl. Cikini IV No.12, RW.5, Cikini, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10330",

            "Jalan Tanah Abang 5 No.36 Gambir RT.13, RT.14/RW.4, Petojo Sel., Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10160"


    };

    private static String[] kordinatResto = {
        "-6.223642621038587, 106.84206798638826",
            "-6.212737985306328, 106.84482664247562",
            "-6.216769931690625, 106.8162614549185",
            "-6.28251993830923, 106.82492807589941",
            "-6.192536163534554, 106.8370548778564",
            "-6.172702495626339, 106.81371413454352"

    };

    private static String[]operasionalResto = {
         "Setiap Hari 10.00 - 22.00 Wib",
         "07.00-14.00 Wib, Setiap Hari Kecuali Jumat",
         "Setiap Hari 11.00-23.00 WIB",
         "Setiap Hari 08.00 - 20.00 WIB",
         "10.00-23.00 WIB",
         "Setiap Hari 08.00 - 20.00 WIB"


    };
    private static String[] deskripsiResto = {
            //kafe betawi
        "Telah berdiri sejak tahun 1992, dalam perjalanan kami, kami terus berupaya menyajikan dan melayani\n" +
                "para pelanggan kami dengan integritas. Hingga saat ini kami memiliki 3 brand restoran lainnya yaitu\n" +
                "Kafe Betawi First, Kafe Betawi Xpress, dan Betawi Corner. Restoran kami sudah tersebar\n" +
                "di Jakarta, Bandung, Surabaya, Bali, Makassar, sampai Manado dengan total mencapai 28 outlet\n" +
                "dan keseluruhannya berada di bawah naungan Umay Group.",
            //Soto H Husein
            "Warung soto Betawi ini sudah ada sejak tahun 1988 dan tampaknya tak berlebihan jika" +
                    " dikategorikan sebagai salah satu kuliner legendaris. Pengunjungnya tak pernah sepi, " +
                    "malah jadi membludak kala akhir pekan tiba, seperti saat detikFood menyambanginya.",

            //Kembang Goela
            "Restoran mewah dengan interior trendi yang menyajikan sate dan masakan Indonesia berkelas.",

            //WArung betawi
            "Ini dia surganya masakan tradisional Indonesia khas Betawi di Jakarta, Warung Betawi " +
                    "H. Muhayar. Ikan Gurame Pecak nya paling GOKIL. Daging guramenya itu lembut," +
                    " tapi kulitnya garing, dan rasanya berpadu pas saat disiram kuah pecak yang segar sekali." +
                    " Sekali makan di restoran betawi di Jakarta ini pasti nggak akan berhenti sampai hanya tersisa tulangnya saja!" +
                    " Sayur Asem di sini pun juga enak banget lho, cocok buat jadi teman makan.",

            //nasi uduk
            "Siapa coba yang nggak tahu masakan Betawi paling terkenal yang satu ini: Nasi Uduk! Nah, " +
                    "Nasi Uduk Gondangdia punya rasa yang unik sekali." +
                    " Aroma nasi uduknya sangat menggoda karena dibungkus daun pisang dan lauk pauk yang disajikan di sini dahsyat semua. " +
                    "Ada banyak yang bisa dipilih di restoran betawi di Jakarta ini, seperti Ayam Bakar, Ayam Goreng, Bebek Goreng, Petai," +
                    " dan lalapan sayuran. Semua cocok dan super enak saat dikombinasikan dengan nasi uduk",
            //gado gado
            "Kalau ngomongin Gado Gado pasti langsung ingat Gado Gado Cemara. Porsinya besar, " +
                    "bisa sharing buat dua orang, dan rasa saus kacangnya nendang abis, beda dari yang lain. " +
                    "Sayuran yang digunakan pun juga segar-segar lho dan menu gado-gadonya 100% vegetarian. " +
                    "Ini bisa jadi salah satu rekomedasi restoran vegetarian di Jakarta buat kamu fans berat sayur." +
                    " Spesialnya lagi, ada kuliner khas Indonesia lainnya yang bisa kamu temukan di Gado Gado Cemara, " +
                    "seperti Pesmol Tengiri yang rasanya nggak kalah enak sama yang di restoran Sunda, dan juga menu Sate"



    };


    public static ArrayList<RestoModel> getListData() {
        ArrayList<RestoModel> list = new ArrayList<>();
        for (int position = 0; position < namaResto.length; position++) {
            RestoModel data = new RestoModel();
            data.setJudul(namaResto[position]);
            data.setImage(gambarResto[position]);
            data.setDeskripsi(deskripsiResto[position]);
            data.setAlamat(alamatResto[position]);
            data.setWaktu(operasionalResto[position]);
            data.setLatlong(kordinatResto[position]);
            list.add(data);
        }
        return list;
    }
}
