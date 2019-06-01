package com.example.android.recyclerviewdean;

import java.util.ArrayList;

public class FoodData {
    public static String[][] data = new String[][]{
            {"Gado-gado", "Makanan Indonesia Pertama Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/4dcd8e5c9b5eb1758ff33f70174ed835.jpg", "Makanan khas Jawa yang bisa disebut sebagai \"saladnya\" Indonesia ini cukup terkenal di luar negeri, terutama di Napoli, Italia. Hal ini dikarenakan gado-gado pernah diikutsertakan dalam kompetisi yang bersaing dengan hidangan dari negara-negara lainnya dan meraih juara pertama. Terhitung dari nilai estetika yang dimiliki, keunikan bahan yang digunakan, serta cita rasa yang dinilai sangat tinggi"},
            {"Sop buntut", "Makanan Indonesia Kedua Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/12afed2483aa255d18670ec96dceabc4.jpg", "Sop buntut sapi, selain digemari masyarakat Indonesia, ternyata juga disukai penduduk Spanyol. Mereka menyukai makanan ini sejak pertama kali kedutaan Indonesia di Italia mengenalkan keanekaragaman makanan khas kita. Kesukaan rakyat Spanyol akan hidangan sapi pun terpuaskan dengan adanya sop buntut ini"},
            {"Tempe", "Makanan Indonesia Ketiga Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/55fafdacad10989d9689f9a9b9ff5375.jpg", "Tempe yang terbuat dari kacang kedelai bisa digabungkan dengan cara penyajian yang bervariatif. Namun tahukah kamu, masyarakat Jepang membuat hidangan ini sebagai salah satu favorit mereka lho. Berawal dari seseorang yang menjual tempe dalam sebuah bazaar kuliner Jepang. Sekali mencoba, mereka langsung menyukainya"},
            {"Rendang", "Makanan Indonesia Keempat Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/56525698751feab3935c2457a35474e5.jpg", "Selain disukai masyarakat Indonesia, makanan khas Sumatera Barat ini juga tersohor hingga seluruh penjuru dunia. Rendang berada di posisi pertama dalam jajaran 50 makanan dunia terenak versi CNN yang diadakan di Jerman beberapa waktu lalu. Rasanya yang khas dan keempukan dagingnya menjadi faktor penentu utama"},
            {"Nasi goreng", "Makanan Indonesia Kelima Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/5e31520bb203e7dd6b3d9e12017c569c.jpg", "Setiap negara memiliki menu nasi goreng. Namun, rasa nasi goreng Indonesia lebih khas karena memakai bumbu lengkap. Gak heran kalau nasi goreng Indonesia juga sempat masuk dalam daftar makanan terenak di dunia. Presiden Amerika Serikat ke-44 Barrack Obama pun sangat menyukai nasi goreng khas Indonesia"},
            {"Mie Goreng", "Makanan Indonesia Keenam Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/870837c3abcbe2a1f9653ab6bd7831d8.jpg", "Pasangan nasi goreng ini bisa kamu temukan di mana-mana. Variasi bumbu dan bahan membuat lezatnya mie goreng khas Indonesia tak tertandingi"},
            {"Bakso", "Makanan Indonesia Ketujuh Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180811/f11ea181b5f99a5237aa4a95340b28cd.jpg", "Kuah sup dan mie memang menjadi bagian dari pelengkap bakso. Kita bisa menemukan bakso di mana pun. Ternyata bakso jadi salah satu makanan favorit warga Tiongkok lho. Pasalnya, bakso yang ada di Indonesia dibuat dari daging sapi yang lebih menggugah selera, ditambah dengan gorengan atau pangsit untuk melengkapinya"},
            {"Sate", "Makanan Indonesia Kedelapan Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180810/d82c032df91f58689eeeaaa2d2eb6fd5.jpg", "Sate Padang dan sate Madura menjadi varian yang paling dikenal sekaligus favorit banyak orang. Belakangan, tidak hanya wisatawan asing yang mencari dan ingin mencoba sate, tetapi sejumlah restoran internasional telah memasukkan sate dalam menunya. Di New York, terdapat sebuah restoran bernama Satay Junction yang menyediakan sate ayam sebagai hidangan andalannya"},
            {"Gudeg", "Makanan Indonesia Kesembilan Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180811/e516afd46ece90badc8634565f4b40e2.jpg", "Makanan khas Yogyakarta ini telah menarik perhatian masyarakat Indonesia, bahkan di kalangan internasional. Pasalnya, banyak negara yang ingin mengimpornya dalam bentuk kalengan. Menariknya lagi, di Melbourne, Australia, terdapat satu restoran yang telah menyajikan gudeg asli dari Indonesia, tepatnya di Clayton Road"},
            {"Soto", "Makanan Indonesia Kesepuluh Paling Disukai Negara Lain", "https://cdn.idntimes.com/content-images/post/20180812/7b0eed69883547ec456cc58125fe4c5a.jpg", "Indonesia memiliki banyak varian soto yang tersebar di berbagai wilayah, antara lain soto Betawi, coto Makassar, soto ayam, soto sapi, dan soto babat. Keunikan setiap rempah dan ciri khas masing-masing inilah yang membuat soto menjadi salah satu makanan ternama di dunia. Masyarakat Ibaraki, Jepang, pun telah terbiasa dengan cita rasa yang telah diperkenalkan beberapa pelajar Indonesia yang ada di sana"},
    };

    public static ArrayList<Food> getListData(){
        Food food = null;
        ArrayList<Food> list = new ArrayList<>();
        for (String[] aData : data) {
            food = new Food();
            food.setName(aData[0]);
            food.setRanking(aData[1]);
            food.setPhoto(aData[2]);
            food.setDesc(aData[3]);

            list.add(food);
        }

        return list;
    }
}
