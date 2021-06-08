package com.dicoding.picodiploma.tanimerceapp.utils

import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.data.StoreEntity

object DataDummy {
    fun generateArticle(): ArrayList<ArticleEntity> {
        val articles = ArrayList<ArticleEntity>()

        articles.add(
            ArticleEntity(
                "1",
                "Apa saja manfaat buah-buahan bagi tubuh kita?",
                "Sumber Vitamin, Berbagai jenis vitamin ada di buah.",
                R.drawable.img1,
                "Sumber Vitamin, Berbagai jenis vitamin ada di buah. \n" +
                        "Sumber Air dan Gizi, buah merupakan salah satu sumber udara untuk tubuh dan kebutuhan gizi yang dapat meningkatkan metabolisme tubuh. \n" +
                        "Sumber antioksidan, buah merupakan salah satu sumber antioksidan alami mencegah penyakit tertentu. Buah-buahan merupakan salah satu cara untuk menghindarkan kita agar tidak terserang penyakit berbahaya dan berbagai penyakit lainnya. Obat luar tubuh, buah-buahan juga dapat digunakan untuk obat luar seperti jerawat, bisul dan lain-lain.",
                "1 min",
                "www.p2ptm.kemkes.go.id"
            )
        )

        articles.add(
            ArticleEntity(
                "2",
                " 5 Jenis Tanaman Hias Daun dengan Perawatan Mudah",
                " Yuk, coba tren berkebun yang jadi hobi favorit banyak orang di tahun 2021. ",
                R.drawable.img2,
                "\t1.Keladi hias \n\n" +
                        "Tanaman dengan genus Caladium dan Alocasia ini memiliki daun yang berwarna-warni dan berbentuk hati. Beberapa jenis keladi memiliki warna solid, dua warna solid dengan pertulangan daun berbeda, hingga lebih dari dua warna dalam satu daun.\n" +
                        "\n\t2.Lidah mertua \n\n" +
                        "Jenis tanaman hias dengan tampilan yang unik dan juga mudah perawatannya yang pertama adalah lidah mertua. Lidah mertua memiliki nama latin Sansevieria trifasciata. Lidah mertua yang banyak dijumpai yakni lidah mertua yang memiliki bentuk daun memanjang, tekstur keras, dan corak garis vertikal pada daunnya. \n" +
                        "Tak hanya cantik, tanaman hias daun yang satu ini juga memiliki manfaat bagi lingkungan dan kesehatan manusia seperti menyerap bahan-bahan beracun seperti karbon dioksida, benzena, formaldehida, dan trichlorethylene yang kurang baik untuk tubuh manusia. Kamu bisa menanamnya di dalam pot dan meletakkannya di sudut ruangan.\n" +
                        "\n\t3. Kaktus \n\n" +
                        "Jenis tanaman hias yang sangat mudah dirawat tentunya adalah kaktus. Ketahanan tanaman ini sudah terkenal dan sangat mudah untuk merawatnya. Namun, untuk menjauhkan tanaman ini dari jangkauan anak-anak. Aneka Ragam jenis dan warna kaktus yang bisa kamu pilih, cocok ditanam dipot untuk menghiasi rumah kamu antara lain Ariocarpus, Astrophytum, Cereus tetragonus, Echinocactus grusonii, Haworthia attenuata dan sebagainya.\n" +
                        "\n\t4. Monster\n\n" +
                        "Jenis tanaman hias satu ini digemari banyak orang. Nama monstera diambil dari bahasa latin monstrou yang artinya tidak normal karena memang bentuk daunnya yang berlubang. Meski kebanyakan memiliki ciri khas berlubang, ada juga yang tidak berlubang. \n" +
                        "Tanaman dengan ukuran daun yang besar dan lebar ini, sering digunakan untuk dekorasi rumah atau bahkan properti foto karena tanaman ini memiliki nilai estetik. Diketahui tanaman jenis philodendron ini masuk dalam keluarga talas-talasan (Araceae).\n" +
                        "\n\t5. Dirih Belanda \n\n" +
                        "Selain meletakkan tanaman dalam pot di atas meja atau sudut rumah, salah satu cara yang menarik adalah dengan pot gantung. Tanaman Sirih Belanda ini termasuk yang cocok ditanam dalam pot gantung. Peralatannya sangat praktis. Kamu hanya perlu siap untuk tanah dan air saja sebagai media tanamnya.",
                "2 min",
                "www.merdeka.com"
            )
        )

        articles.add(
            ArticleEntity(
                "3",
                " 5 Tanaman Buah ini Bisa Tumbuh dalam Pot dan Masa Panennya Berkali-kali.",
                " Menanam buah di pekarangan rumah kecil bahkan di teras tak lagi jadi hal yang mustahil.",
                R.drawable.img3,
                " Pasalnya, ada beberapa jenis tanaman buah yang dapat dibudidayakan dengan menggunakan media tanam pot atau polybag. Jadi, akan cocok jika disandingkan dengan tanaman hias untuk mengisi halaman rumah yang kosong.\n" +
                        "\n1. Stroberi\n" +
                        "\nStroberi ancaman dapat dipanen setelah berusia 2 bulan atau bahkan kurang. Kuncinya, stroberi mesti dijauhkan dari tanaman hama dan disiram rutin setiap pagi serta sore hari. Pastikan juga tanaman stroberi mendapatkan sinar matahari cukup setidaknya selama 6 sampai 8 delapan jam setiap harinya. Supaya stroberi bisa berbuah terus-menurus, petiklah dengan hati-hati atau gunakan pisau agar tak merusak akar tanamannya.\n" +
                        "\n\t2. Jeruk\n" +
                        "\nHampir semua varietas jeruk dapat tumbuh dengan baik di dalam media tanam pot. Selama perawatannya benar, jeruk akan mampu berbuah sebanyak 4 sampai 5 kali dalam kurun waktu tiga tahun. Kunci pemeliharaan budidaya jeruk ada di proses penyiraman dan mempersembahkan pupuk yang konsisten. Berbeda dengan tanaman buah lainnya, cukup jeruk disirim dua hari sekali agar akarnya nggak gampang busuk dan lebih cepat panennya. Saat musim hujan, waktu penyiramnya pun bisa disesuaikan.\n" +
                        "\n\t3. Jambu Air\n" +
                        "\nBiasanya, tanaman jambu air akan tumbuh tinggi seperti buah jambu lainnya. Namun, jika kamu menanam dengan menggunakan bibit yang sudah dicangkok dari induk, hasil pertumbuhannya akan berubah. Bibit jambu air yang sudah dicangkok kurang lebih selama tiga bulan akan lebih mudah tumbuh dalam pot media. Untuk mempercepat masa panen, siramlah tanaman jambu air dua kali sehari dan beri pupuk sebulan sekali. Niscaya jambu air pun akan berbuah kurang dari satu tahun.\n" +
                        "\n\t4. Delima \n" +
                        "\nTanaman buah seperti delima memiliki sistem perakaran yang lebih pendek dibanding buah-buah lainnya. Delima kerap dipilih oleh mereka yang nggak begitu telaten, tapi tetap pengin tumbuh tanamannya. Tanaman ini bisa tumbuh dengan baik dan berbuah kurang dari satu tahun. \n" +
                        "\nCukup sirami dua kali seminggu dan taruh pot di bawah sinar matahari hari agar proses pembuahannya lebih cepat. Perlu diketahui juga bahwa delima dapat dijadikan bonsai, sehingga cocok untuk dimanfaatkan sebagai tanaman buah dalam ruangan sekaligus bisa mempercantik rumahmu.\n" +
                        "\n\t5. Anggur \n" +
                        "\nUntuk menanam anggur di halaman rumah, kamu butuh pot berukuran besar yang lebih besar nanti bisa ditopang dengan baik. Sebenarnya, perawatan tanaman anggur sama saja dengan tanaman lainnya, bedanya hanya dengan penggunaan pupuknya saja. Pakailah pupuk organik cair keluarga rasa anggur lebih manis dan cepat panennya. Pilihlan varietas anggur yang tumbuh kecil agar lebih mudah mengontrol sulurnya.",
                "2 min",
                " www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "4",
                " 5 Cara Menanam Wortel di Pot Agar Tumbuh Subur dan Cepat Panen",
                " Wortel jadi salah satu sayuran yang mudah ditanam sendiri di rumah.",
                R.drawable.img4,
                "Wortel jadi salah satu sayuran yang mudah ditanam sendiri di rumah. Apalagi jika kamu tinggal di daerah dataran tinggi, maka wortel akan mudah tumbuh dengan subur. Kendati begitu, bukan berarti menanam wortel di dataran rendah itu nggak bisa diupayakan. Dengan cara yang tepat, kamu juga bisa menanam wortel dengan mudah, lho, di dataran rendah.\n" +
                        "\n\t1. Sebelum menanam, kamu harus melihat wortel dan tumbuh kembang tanaman yang satu ini\n" +
                        "\n\t2. Selalu pilih bibit unggulan jika membeli di toko pertanian atau kamu bisa membuatnya sendiri dari sisa dapur\n" +
                        "\n\t3. Media simpanan tanam berupa campuran tanah, pasir halus, tanah merah, dan kompos ke dalam pot. Satu pot bisa diisi oleh beberapa bibit dengan jarak 3 cm\n" +
                        "\n\t4. Siram wortel seperlunya hanya untuk melembapkan tanah. Jangan menyiram terlalu sering karena bisa menyebabkan wortel sakit\n" +
                        "\n\t5. Wortel harus dipanen jika usianya sudah mencapai 2 sampai 2,5 bulan. Kalau sampai telat panen, rasa wortel bisa berkurang dan teksturnya bakal keras.",
                "1 min",
                " www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "5",
                " 5 Sistem hidroponik mempunyai sejumlah kelebihan dan kekurangan yang perlu diperhatikan.",
                " Kata hidroponik berasal dari hydro yang artinya udara.",
                R.drawable.img5,
                " Kata hidroponik berasal dari hydro yang artinya udara. Jadi tanaman hidroponik adalah tanaman yang menggunakan air sebagai media tumbuhnya. Tanaman hidroponik stadion di tempat yang mudah terpengaruh agar berkembang maksimal. Berbeda dengan tanaman biasa yang menggunakan tanah, jenis tanaman ini bisa memakai berbagai media \n" +
                        "Sistem hidroponik mempunyai sejumlah kelebihan dan kekurangan yang perlu diperhatikan\n" +
                        "\n1. Lebih hemat \n" +
                        "\tTanaman hidroponik nggak membutuhkan tanah. Jadi kita tidak punya halaman yang luas untuk menanamnya. Cukup sediakan paralon atau wadah yang diisi air. Tentunya ini bisa memberikan lebih banyak tempat. Apalagi, tanaman hidroponik bisa diatur sampai bertingkat-tingkat.\n" +
                        "\n2. Tenaga yang dikeluarkan lebih sedikit \n" +
                        "\tKalau memilih tanaman hidroponik, kita nggak perlu repot-repot mengolah lahan. Bahkan nggak perlu menyirami tanaman setiap hari karena tanamannya sudah dialiri udara. Proses panennya juga lebih simpel. Secara total, tenaga yang dikeluarkan untuk merawat tanaman hidroponik lebih sedikit dibandingkan tanaman biasa.\n" +
                        "\n3. Pertumbuhan tanaman lebih cepat dan hasil panennya cenderung lebih banyak \n" +
                        "\tWalaupun jarang membutuhkan pupuk, hasil panen tanaman hidroponik bisa lebih banyak. Pertumbuhannya juga lebih cepat dibandingkan tanaman pada umumnya karena dialiri udara setiap saat. Yang nggak kalah penting, tanaman hidroponik nggak cocok cuaca. Jadi kita bisa tetap bercocok tanam saat cuaca panas maupun dingin. Tetapi, terletak di tanaman hidroponik terletak pada tempat yang tidak terkena hujan.\n" +
                        "\n4. Tanaman bebas dari pestisida \n" +
                        "\tKarena menggunakan media udara, risiko terserang hama dan penyakit bakal lebih kecil. Jadi kita tidak perlu menggunakan pestisida yang berbahaya. Ini bisa membuat tanaman lebih sehat dan alami. Saat mengonsumsi hasil panennya, kita juga terbebas dari perasaan khawatir.\n" +
                        "\n5. Bisa membutuhkan modal yang besar \n" +
                        "\tSistem hidroponik memang bisa dilakukan dengan modal seadanya. Tetapi kalau mau berkebun dalam skala besar, dibutuhkan modal yang cukup banyak. Sebab kita harus membeli peralatan, dan mengeluarkan biaya pemeliharaan. Apalagi alat resmi untuk hidroponik masih sulit diperoleh.",
                "2 min",
                "www.hipwee.com"
            )
        )


        articles.add(
            ArticleEntity(
                "6",
                " 4 Cepat Panen Plus Cara Merawatnya tanaman hindroponik, Gampang dan Cocok untuk Pemula",
                " Selain bersepeda, kegiatan berkebun semakin diminati orang-orang belakangan ini.",
                R.drawable.img6,
                " Selain bersepeda, kegiatan berkebun semakin diminati orang-orang belakangan ini. Salah satu rasa adalah menikmati sayuran dan buah-buahan yang ditanam sendiri. Berkebun juga bisa membuat perasaan jadi lebih rileks. Itulah yang membuat banyak orang mencoba berkebun dengan modal seadanya. Apalagi kita nggak perlu lagi menyediakan lahan yang luas. Pasalnya, ada sistem hidroponik yang menggunakan air sebagai media tanam. Jadi kita bisa melakukannya di manapun, bahkan perkotaan yang penuh sesak. \n" +
                        "Kata hidroponik berasal dari hydro yang artinya udara. Jadi tanaman hidroponik adalah tanaman yang menggunakan air sebagai media tumbuhnya. Tanaman hidroponik stadion di tempat yang mudah terpengaruh agar berkembang maksimal. Berbeda dengan tanaman biasa yang menggunakan tanah, jenis tanaman ini bisa memakai berbagai media \n" +
                        "Ada beberapa cara membuat tanaman hidroponik, sebaiknya pilih tekniknya sesuai kemampuan dan kondisi\n" +
                        "\n1. Sistem sumbu atau sumbu \n" +
                        "\tDibandingkan yang lainnya, sistem sumbu paling gampang dilakukan sehingga cocok untuk pemula. Yang dibutuhkan adalah dua wadah, terdiri dari satu untuk penampungan air dan satu lagi untuk media tanam. Hubungkan kedua wadah dengan sebuah sumbu yang terbuat dari sabut kelapa, vermikulit, atau perlite. Sumbu itu bakal mengalirkan nutrisi dari wadah penampungan air ke wadah yang berisi tanaman.\n" +
                        "\n2.Sistem tetes atau irigasi tetes \n" +
                        "\tIni adalah sistem tanaman hidroponik sederhana yang sering digunakan oleh berbagai kalangan. Kita membutuhkan satu wadah untuk media tanam dan satu wadah lagi untuk penampungan air. Keduanya dipasang dengan pompa air dan pompa nutrisi. The from the ball that number of will be dropeskan solution in the root-akar tumbuhan.\n" +
                        "\n3. Sistem pasang surut \n" +
                        "\tCara ini sangat populer di kalangan orang-orang yang merawat tanaman hidroponik rumahan. Bagaimana caranya? Siapkan beberapa wadah berisi tanaman. Hubungkan semua wadah itu menggunakan pipa. Kita juga harus terhubungnya dengan pompa air yang dikendalikan timer. Secara otomatis, pompa itu bakal mengalirkan air ke wadah tanaman sampai ketinggian tertentu. Kemudian airnya bakal surut kalau pompa dimatikan.\n" +
                        "\n4. Sistem rakit apung \n" +
                        "\tSistem ini adalah cara bercocok tanam hidroponik yang modern. Caranya, tempatkan tanaman di atas styrofoam yang sudah dibolongi. Lalu taruh semua styrofoam itu di wadah berisi air. Jadi akar tanamannya bisa mengapung di atas larutan nutrisi. Praktis juga ya! Tetapi, akar tanamannya rentan membusuk karena selalu tergenang udara.",
                "2 min",
                " www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "7",
                " 3 Cara Menanam Sawi yang Bisa Kamu Praktikkan Langsung di Rumah",
                " Berikut cara menanam sawi hijau dan jenis lainnya dengan berbagai metode.",
                R.drawable.img7,
                " Berikut cara menanam sawi hijau dan jenis lainnya dengan berbagai metode. Bisa pakai media tanam pot atau bahkan hidroponik air di dalam botol \n" +
                        "Tak cuma dipakai sebagai  sawi pakcoy saja, beberapa metode ini juga dapat diterapkan untuk menanam jenis sawi lainnya, misalnya sawi caisim atau sawi putih. Nah, biar nggak busuk dan metode tanammu berhasil, berikut ada beragam cara menanam sawi di rumah yang bisa dipraktikkan.\n" +
                        "1. Cara menanam sawi di polybag \n" +
                        "Bibit yang sudah dipilih harus disemai dulu dengan menggunakan campuran tanah humus dan sub soil yang sudah ditempatkan pada polybag berdiameter 15 cm. Umumnya, proses semai akan memakan waktu sekitar 3 sampai 4 minggu atau hingga sawi tumbuh tunas. Supaya penyemaian berhasil, biji sawi harus disiram secara rutin tiap pagi dan sore hari. Nah, kalau sudah selesai proses penyemaiannya, berikut langkah menanamnya: \n" +
                        "Gunakan polybag berdiameter 15 cm dan beri lubang di bagian samping dan bawahnya supaya akar sawi nggak busuk. Satu polybag dapat menampung 3 sampai 5 benih. \n" +
                        "Pindahkan tunas secara hati-hati, kalau sudah selesai, lakukan penyiraman rutin di pagi dan sore hari. Selain itu, beri pupuk organik setiap satu minggu sekali. Sawi biasanya bisa dipanen setelah berusia 3 bulan. \n" +
                        "Berbeda dengan cara menanam sawi di polybag, cara menanam sawi di pot lebih simpel karena tak perlu dilakukan penyemaian. Benih sawi unggul bisa langsung ditabur saja di pot yang sudah dicampur dengan tanah humus dan pupuk organik dengan perbandingan 1:3. Meski awal proses penanamannya berbeda, perawatan dan masa panennya hampir sama kok.\n" +
                        "2. Cara menanam sawi dengan hidroponik \n" +
                        "Menggunakan media hidroponik, kamu mesti menyiapkan alat dan bahan lebih banyak seperti larutan nutrisi, abu sekam, sumbu, hingga botol bekas. Namun sama dengan metode lain, cara tanam sawi hidroponik pun mesti melalui proses penyemaian dulu. \n" +
                        "Benih bisa disemai dalam bendungan yang sudah berisi tanah dan pupuk kompos dengan perbandingan 1:2, lalu diamkan sampai tumbuh tunas dengan tinggi kurang lebih 3 cm atau sudah ada 2 sampai 3 daun. \n" +
                        "Sambil menunggu proses semai, kamu bisa menyiapkan media tanamnya dulu. Potong botol bekas jadi dua bagian, beri lubang dan masukkan sumbunya. Setelah itu, isikan botol dengan abu sekam secukupnya kemudian lubangi paralon seukuran botol lalu masukkan botol yang sudah diberi sumbu tadi. Masukkan nutrisi hidroponik pada paralon dan diamkan sampai 2 hari atau hingga tunas tumbuh. \n" +
                        "Bibit yang sudah berakar bisa langsung ditanam pada botol yang sudah disiapkan. Pindahkan secara perlahan supaya akarnya nggak putus. \n" +
                        "Untuk perawatannya, cukup berikan larutan nutrisi setiap hari di awal penanaman. Selanjutnya, bisa dikurangi intensitasnya. Sawi yang ditanam dengan cara hidroponik bisa dipanen lebih awal, yakni di usia 2 bulan.\n" +
                        "3. Cara menanam sawi di kebun rumah \n" +
                        "Sawi bisa ditanam di lahan terbuka dan sinar matahari penuh jika dibudi daya di daerah dingin, jika di daerah panas, sawi dapat ditanam di lahan terbuka yang nggak kena sinar matahari langsung. Sama halnya dengan metode tanam di pot, kalau ditanam di kebun langsung, sawi tak perlu disemai dulu. Langsung taburkan saja benihnya, siram, tunggu sampai bertunas dan daunnya lebat. Namun, pastikan tanah terus lembap supaya sawi yang ditanam nggak mati atau kering.",
                "2 min",
                " www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "8",
                " Cara Mengolah Pupuk Tanaman dari Minyak Jelantah",
                " Minyak goreng bekas atau yang lebih dikenal dengan minyak jelantah adalah salah satu limbah rumah tangga yang hingga kini masih jadi permasalahan serius.",
                R.drawable.img8,
                " Minyak goreng bekas atau yang lebih dikenal dengan minyak jelantah adalah salah satu limbah rumah tangga yang hingga kini masih jadi permasalahan serius. Minyak jelantah sering dibuang secara sembarangan dan berakhir mencemari lingkungan. Padahal minyak jelantah merupakan energi alternatif yang bisa dimanfaatkan sebagai bahan bakar dan beragam hal positif lainnya lo! Salah satu yang jarang orang ketahui adalah pemanfaatan minyak jelantah untuk pupuk tanaman. \n" +
                        "Penasaran kan seperti apa pengolahan minyak jelantah untuk dijadikan pupuk tanaman? Berikut ulasan lengkapnya.\n" +
                        "1. Kandungan minyak jelantah yang bermanfaat untuk tanaman \n" +
                        "Sudah dijelaskan sebelumnya bahwa pengertian minyak jelantah adalah minyak goreng yang telah mengalami beberapa reaksi akibat penggorengan berulang. Reaksi tersebut menghasilkan asam lemak jenuh yang tinggi. Nah, sementara asam lemak ini merupakan asam karboksilat yang sangat berbahaya untuk kesehatan manusia, kandungan asam lemak ini akan bermanfaat bagi tanaman sebagai pupuk, namun harus melalui proses pengolahan terlebih dahulu.\n" +
                        "2. Siapkan bahan dan peralatan yang diperlukan untuk mengolah minyak jelantah menjadi pupuk tanaman \n" +
                        "Banyak orang yang belum tahu kalau sebenarnya minyak jelantah memiliki banyak manfaat. Sebenarnya, minyak jelantah untuk apa sih alih-alih dibuang begitu saja? Ada beberapa kegunaan, seperti minyak jelantah untuk biodiesel, minyak jelantah untuk lilin, dan manfaat minyak jelantah untuk tanaman berupa pupuk olahan. \n" +
                        "Lantas, bahan dan peralatan apa saja yang harus kita persiapkan untuk daur ulang minyak jelantah menjadi pupuk? \n" +
                        "Bahan yang harus dipersiapkan: \n" +
                        "Minyak jelantah 500-1000 cc \n" +
                        "Bekatul \n" +
                        "Air \n" +
                        "EM4 \n" +
                        "Molase/tetes tebu \n" +
                        "Peralatan yang harus dipersiapkan:\n" +
                        "Saringan \n" +
                        "Jeriken/ember bertutup \n" +
                        "Selang bening kecil \n" +
                        "Gayung \n" +
                        "Botol\n" +
                        "3. Membuat pupuk dari minyak jelantah berarti melewati proses fermentasi dengan bahan-bahan yang sudah disiapkan. Fermentasi sempurna biasanya dihasilkan setelah 30 hari \n" +
                        "Minyak termasuk limbah B3 yang mampu mencemari tanah dan sungai. Maka dari itu, bisnis minyak jelantah berupa daur ulang dan pemanfaatan kembali sangat dibutuhkan. Pengolahan minyak jelantah menjadi pupuk ini adalah contohnya. Setelah bahan dan peralatannya siap, lanjut ke langkah pembuatannya berikut. \n" +
                        "Campurkan bahan minyak jelantah dengan air, bekatul, molase, dan EM4. Lalu aduk secara merata. \n" +
                        "Masukan hasil adonan dari bahan-bahan tersebut ke dalam jeriken atau ember yang memiliki tutup rapat, lalu letakkan jeriken tersebut pada tempat yang terhindar dari paparan sinar matahari langsung. \n" +
                        "Pembuatan pupuk ini mengandalkan fermentasi. Maka dari itu, lubangi tutup jeriken dan masukkan selang kecil hingga masuk ke adonan. Ujung selang yang berada di luar tadi, dimasukkan pada botol kecil berisi air untuk mengontrol suhu selama proses fermentasi. \n" +
                        "Biarkan adonan tersebut selama satu bulan. Proses fermentasi yang baik untuk pupuk ini membutuhkan waktu 30 hari. \n" +
                        "Tanda pupuk sudah jadi adalah ketika adonan nggak berbau busuk, namun berbau asam khas POC (Pupuk Organik Cair). Lalu saat jeriken digoyangkan akan muncul gelembung-gelembung kecil dalam jumlah banyak membentuk seperti busa.\n" +
                        "4. Gunakan pupuk jelantah dengan dosis 5 ml – 10 ml untuk tanaman. Hindari dosis berlebih dan berikan pupuk pada tanaman dengan jarak waktu 1-2 minggu sekali untuk hasil yang sempurna \n" +
                        "Lalu bagaimana cara mengaplikasikan pupuk jelantah ini pada tanaman? Apakah pupuk ini berguna dan dijamin keamanannya? Aplikasikan pupuk jelantah ini dengan konsentrasi sedikit saja yakni sekitar 5 ml/liter untuk semprot dan 10 ml/liter untuk sistem kocor siram. Nggak seperti pupuk-pupuk alami lain, akan lebih baik jika mengaplikasikan pupuk jelantah ini ketika tanaman sudah memiliki daun sempurna yakni minimal 3 minggu setelah tanam. Penggunaan pupuk ini juga sebaiknya dilakukan 1-2 minggu sekali. \n" +
                        "Pemberian dosis pupuk adalah hal yang paling penting. Selalu hindari memberi dosis besar pada tanaman karena pupuk ini bisa menyumbat stomata. Hal ini bisa terjadi karena pupuk belum terfermentasi sempurna. Sampai hari ini, pupuk jelantah terus dikembangkan agar bisa bermanfaat lebih dan mengurangi limbah minyak. \n" +
                        "Nah, itu dia beberapa penjelasan mengenai cara pengolahan minyak jelantah menjadi pupuk berikut pengaplikasiannya ke tanaman.Gimana menurut kalian? Berguna banget kan ? Nggak heran kalau di luar sana ada banyak pengepul minyak jelantah untuk dimanfaatkan kegunaannya.Kamu juga bisa lo !Yuk, mulai peduli lingkungan.",
                "3 min",
                "www. hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "9",
                " 5 Tanaman yang Bisa Ditanam di Dapur. Berkebun di Dapur, Kenapa Nggak?",
                " Sekarang ini, tanaman juga menjadi aspek yang penting dalam interior design di rumah, ya.",
                R.drawable.img9,
                " Sekarang ini, tanaman juga menjadi aspek yang penting dalam interior design di rumah, ya. Tanaman bisa bikin suasana rumah jadi lebih segar dan asri. Bukan cuma di kebun, tanaman juga bisa ditaruh di dalam rumah, apalagi kalau halaman rumah tidak terlalu besar. Kalian tinggal menyesuaikan tanaman indoor apa yang cocok buat di dalam rumah dan berkreasi, deh! \n" +
                        "Biasanya, tanaman-tanaman indoor ditaruh di beberapa ruangan kayak ruang keluarga, ruang makan, kamar tidur, atau kamar mandi. Tapi, tahu nggak, sih? Dapur juga bisa jadi tempat untuk menjalankan hobi berkebun! \n" +
                        "Simak beberapa inspirasi tanaman di bawah ini, yuk, supaya dapur rumah bisa disulap menjadi tempat untuk tanaman-tanaman kesayangan!\n" +
                        "1. Petik bahan masakan sendiri setiap mau masak dengan tanaman sayur dan bumbu dapur \n" +
                        "Sebagai tempat masak, letakkan tanaman-tanaman yang bisa digunakan buat bumbu dapur atau garnish buat masakan. Misalnya kayak daun basil, daun mint, daun salam, bawang merah, daun bawang, seledri, sampai cabai. Jadi, kalau mau masak, tinggal petik, deh!\n" +
                        "2. Tanaman penyegar udara alami pastikan dapur segar, wangi, dan bebas bau asap \n" +
                        "Tanaman-tanaman berikut ini punya kemampuan buat menyegarkan udara secara alami, loh. Biasanya sehabis masak, ada bau-bau menyengat atau asap dari berbagai jenis masakan. Dengan tanaman-tanaman seperti lili paris, sri rezeki, lidah mertua, dan lidah buaya akan menetralisir udara kotor di dapur.Jadi letakkan beberapa tanaman ini di sudut-sudut kitchen set supaya dapur rumah tetap nyaman dengan agen pembersih udara alami.\n" +
                        "3. Dapur bebas pengharum ruangan kimia dengan pewangi alami melalui tanaman di dapur.Sebagai tempat mengolah dan memasak makanan, ada kekhawatiran saat menggunakan pengharum ruangan kimia. Residu-residu kimia bisa berisiko untuk menempel di kitchen counter, alat masak, dan alat makan. Solusinya, tempatkan tanaman-tanaman yang mengeluarkan aroma alami supaya dapur tetap wangi. \n" +
                        "Tanaman-tanaman seperti melati, lavender, atau jeruk punya wewangian alami yang menyebar di seluruh sudut dapur. Maka dari itu, dapur tetap wangi tanpa perlu khawatir dengan pengharum ruangan.\n" +
                        "4. Tanaman yang tahan panas dan udara lembap agar tidak perlu khawatir layu saat ditempatkan di dapurMeletakkan tanaman di dapur bisa untuk memenuhi unsur estetika dapur. Sebelumnya, perlu dipastikan kalau tanaman tersebut punya ketahanan panas dan udara lembab yang memadai. Mengingat suhu dapur bisa menjadi panas dan lembab karena proses masak, jangan sampai tanaman yang dipilih tidak tahan panas. \n" +
                        "Beberapa pilihan untuk tanaman hiasan di dapur adalah kaktus, violet afrika, sampai bunga kamboja karena ketahanannya terhadap iklim tropis dan terutama suhu yang relatif lebih tinggi dari iklim subtropis.\n" +
                        "5. Ciptakan suasana baru yang lebih alami dengan tanaman gantung di dapur rumahUntuk fungsi estetika dapur yang berbeda dari tanaman dalam pot yang ditaruh di counter atau kabinet, tanaman gantung bisa menjadi alternatif untuk tampilan berbeda yang lebih segar. Gunakan tanaman seperti sirih gading, english ivy, atau million heart dan gantung di salah satu sudut dapur. Misalnya di atas kitchen island lengkap dengan kursi bar. \n" +
                        "Itulah tadi lima inspirasi untuk mengubah dapur menjadi “kebun” di dalam rumah. Tanaman-tanaman ini relatif mudah untuk didapatkan dan terjangkau. Jadi, tentukan mana yang cocok dan tingkatkan interior design dapur dengan mulai mendekorasi.",
                "2 min",
                "www. hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "10",
                " Cara Menanam Seledri dari Batang atau Biji. Celupkan ke Gelas Berisi Air Bakal Tumbuh Sendiri",
                " Salah satu sayuran yang sering dikonsumsi oleh masyarakat Indonesia adalah seledri.",
                R.drawable.img10,
                " Salah satu sayuran yang sering dikonsumsi oleh masyarakat Indonesia adalah seledri. Biasanya, para petani seledri menggunakan teknik cara menanam seledri di sawah atau cara menanam seledri di polybag mengingat mereka memiliki medium yang luas untuk menanam seledri dalam skala yang luas. Namun semenjak teknologi teknologi hidroponik semakin meluas, kita bisa menanam beragam jenis sayuran sendiri. Nah, seledri menjadi salah satu sayuran yang sering digunakan untuk bahan ‘percobaan’ karena tanaman ini tumbuh dengan cepat dan nggak ribet. Nggak heran, banyak orang mulai mencari-cari artikel soal cara menanam seledri hidroponik sampai cara menanam seledri tanpa akar.\n" +
                        "1. Pilih biji atau batang seledri yang subur dan segar. Kamu hanya perlu memilih seledri yang memiliki ukuran batang besar dan terlihat segar \n" +
                        "Sebenarnya, menanam seledri nggak terlalu sulit. Apalagi kalau kamu sudah tahu karakter dan kebutuhan tanaman sayur satu ini. Kamu bisa menggunakan beragam cara untuk menanam seledri. Misalnya, menggunakan cara menanam seledri dari sisa batangnya. \n" +
                        "Kamu hanya perlu memilih seledri yang memiliki ukuran batang besar dan masih segar. Potong batangnya kira-kira 5 cm dari ujungnya. Selain lewat batang, kamu juga bisa menggunakan biji atau benih seledri langsung. Kamu bisa menemukan penjual benih seledri di toko-toko pertanian atau bisa mendapatkannya lewat toko daring dengan harga yang terjangkau.\n" +
                        "2.Sebagai awalan, coba tanam batang seledri dalam wadah berisi air. Pastikan batang hanya masuk setengahnya agar seledri bisa menumbuhkan tunas baru \n" +
                        "Jika sudah mendapatkan bibit batang terbaik, kamu bisa mulai cara menanam seledri di air lewat medium gelas kecil atau mangkuk kecil berisi air. Kamu juga bisa mengganti gelas atau mangkuk dengan botol bekas. Kamu hanya perlu memastikan kalau air dalam wadah nggak merendam semua potongan batang. Usahakan batang seledri hanya masuk setengahnya saja. \n" +
                        "Jika sudah disimpan dalam air, simpan seledri di tempat yang pencahayaannya baik dan suhunya lembap. Sebab suhu udara adalah hal paling penting bagi pertumbuhan dan kesuburan tanaman seledri.\n" +
                        "3. Jika batang sudah menumbuhkan daun dan tunas baru, pindahkan tanaman seledri ke medium pot, botol bekas, atau halaman rumah yang memiliki tanah subur \n" +
                        "Setelah disimpan beberapa hari di wadah air, batang seledri akan memunculkan daun-daun kecil. Jika sudah seminggu, biasanya akan muncul tunas baru dari batang seledri awal. Jika sudah mengeluarkan tanda-tanda pertumbuhan tersebut, kamu harus mulai memindahkan dengan cara menanam seledri di pot berisi tanah agar seledri nggak membusuk. \n" +
                        "Pindahkan dan tanam ulang batang seledri ke dalam pot, botol bekas, atau halaman yang pastinya ada medium tanahnya. Tanam di tanah yang subur dan kaya nutrisi, bukan tanah berpasir yang gersang. Ingat, kelembapan itu penting.\n" +
                        "4. Pada awal pertumbuhan, dianjurkan untuk menyiram seledri 2-3 kali sehari. Jika sudah tumbuh cukup, siram 2-3 kali dalam seminggu \n" +
                        "Meski butuh kelembapan, seledri juga nggak boleh terlalu basah karena dapat membusuk. Pada minggu pertama, kamu harus menyiram tanaman ini setiap pagi dan sore. Setelah muncul daun yang agak rimbun, kamu hanya perlu menyiramnya 2-3 kali dalam seminggu. Penyiraman ini tujuannya untuk memastikan tanaman seledri mendapat air yang cukup.\n" +
                        "5. Untuk merangsang pertumbuhan dan kesuburan tanah, gunakan pupuk organik cair secukupnya pada tanaman seledri \n" +
                        "Sebenarnya, jika jumlah seledri yang kamu tanam nggak banyak, kamu nggak perlu memberi pupuk. Namun, jika kamu memang serius membudidayakan seledri dengan cara organik dan berniat untuk menjadikannya bisnis, maka memberi pupuk adalah salah satu cara menanam seledri agar tumbuh subur dan cepat. \n" +
                        "Sangat dianjurkan untuk memberikan pupuk organik cair karena hasilnya yang terbukti efektif. Nggak perlu risau, pupuk organik cair yang sudah jadi bisa kamu temukan di toko pertanian atau bisa meraciknya sendiri di rumah. Siapkan sebanyak 10 ml bahan pupuk yang dicampurkan dengan 1 liter air, lalu siramkan secara merata pada tanah di sekitar tanaman.\n" +
                        "6. Jika muncul hama, basmi dengan pestisida organik agar kesegaran tanaman tetap terjaga \n" +
                        "Seledri bukan tanaman yang mengundang hama atau sering terkena penyakit. Apalagi jika kita hanya menanam seledri pada media pot, polybag, atau hidroponik. Penyakit dan hama biasanya muncul pada budidaya seledri dalam skala yang luas yang diperuntukkan untuk bisnis. Jika hal ini terjadi, basmi hama tanaman dengan pestisida organik agar kesegaran dan pertanian organik tetap terjaga. Jangan pakai pestisida kimia ya~ \n" +
                        "Nah, itu dia beberapa cara untuk menanam seledri lewat batang dan biji. Sebenarnya ada banyak cara untuk membudidayakan tanaman ini. Kamu juga bisa menggunakan cara menanam seledri dari akar atau cara menanam seledri dari sisa dapur yang sudah nggak terpakai. Jangan takut mencoba, ya!.",
                "4 min",
                "www. hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "11",
                " Nggak Seperti Cabe Biasa, Ini 7 Khasiat Cabe Jawa yang Bagus untuk Stamina dan Nafsu Makan",
                " 1.cabe jawa juga punya manfaat bagi para perempuan karena bisa mengatasi sakit sakat premenstruation syndrom alias PMS.",
                R.drawable.img11,
                " 1.cabe jawa juga punya manfaat bagi para perempuan karena bisa mengatasi sakit sakat premenstruation syndrom alias PMS \n" +
                        "Nggak hanya bermanfaat bagi para pria, rupanya cabe jawa kering juga dipercaya bisa mengobati PMS yang sering dialami oleh perempuan sebelum menstruasi. Ada banyak cara alami yang bisa mengatasi sakit saat PMS. Salah satunya bisa menggunakan cabe jawa. Bahan makanan ini dipercaya bisa mengatasi kelelahan, nyeri, kram perut dan aliran menstruasi yang tak normal. Caranya cukup mudah, kamu hanya perlu mengonsumsi ramuan cabe jawa timur dengan campuran rempah-rempah lainnya.\n" +
                        "2.Buatmu yang sedang diet, minum ramuan herbal cabe jawa bisa membantu membantu menurunkan berat badan. Cabe jawa ini bisa mengeluarkan lemak beracun dalam tubuh \n" +
                        "Sama halnya dengan jenis cabe lain, salah satu manfaat cabe jawa adalah menurunkan berat badan secara alami. Kandungan dalam cabe jawa rupanya bisa mengeluarkan lemak beracun yang ada dalam tubuh. Biasanya lemak beracun tersebut berasal dari makanan olahan, makanan dengan lemak berlebih dan junkfood. \n" +
                        "Masukkan cabe jawa sebagai tambahan bumbu dalam menu makanan sehari sekali atau coba membuat ramuan herbal dengan campuran rempah-rempah lainnya. Kendati demikian, cabe jawa hanya membantu merangsang penurunan berat badan lo ya, yang paling penting adalah gaya hidup sehat dan olahraga teratur.\n" +
                        "3. Cabe jawa punya antibakteri alami yang berguna melawan penyakit dari infeksi bakteri seperti batuk, sakit tenggorokan, pembengkakan, peradangan, dan sakit perut \n" +
                        "Infeksi bakteri menyebabkan beragam penyakit seperti sakit perut, sakit tenggorokan, pembengkakan, peradangan, dan lain sebagainya. Untuk melawan bakteri penyebab penyakit tersebut, manusia membutuhkan kandungan antibakteri dalam tubuh. \n" +
                        "Ada banyak cara untuk mendapatkan asupan antibakteri, salah satunya adalah mengonsumsi makanan alami. Nah, cabe jawa adalah salah satu makanan yang mengandung sifat antibakteri dan antiamuba yang kuat. Sebelum ditemukan antibakteri modern, masyarakat tradisional membuat obat herbal dari akar, batang, dan cabe jawa untuk melindungi tubuh dari penyakit yang disebabkan bakteri.\n" +
                        "4. Kandungan senyawa alkaloid, vitamin B, dan zat besi yang tinggi membuat cabe jawa sering dijadikan obat herbal untuk mengatasi demam berdarah, malaria, beri-beri, dan anemia \n" +
                        "Selain memiliki antibakteri, cabe jawa juga mengandung beberapa senyawa seperti alkaloid, vitamin B, dan stomakika yang kaya akan zat besi. Kandungan-kandungan tersebut memiliki banyak khasiat yang bisa menyembuhkan beragam penyakit, memelihara kecantikan kulit, mencegah penuaan dini sampai mencegah stroke. \n" +
                        "Senyawa alkaloid dalam cabe jawa yang telah disebutkan di atas berfungsi sebagai metabolit dan punya sifat racun. Hal inilah yang bisa mencegah penyakit malaria dan demam berdarah. Sementara kandungan vitamin B tinggi dalam cabe jawa mampu mengatasi penyakit beri-beri yang disebabkan kekurangan vitamin B. Stomakika yang kaya akan zat besi bisa membantu mengatasi penyakit anemia atau kekurangan darah. Banyak banget ya manfaatnya~\n" +
                        "5. Untuk mencegah atau mengobati diabetes, cabe jawa baik dikonsumsi untuk mengatur jumlah glukosa yang dilepaskan dalam darah \n" +
                        "Selain untuk penyakit-penyakit di atas, cabe jawa juga punya manfaat mengatur jumlah glukosa yang dilepaskan dalam darah yang mendorong produksi insulin. Pengaturan jumlah glukosa menjadi krusial bagi mereka yang ingin mencegah atau mengobati penyakit diabetes.\n" +
                        "6. Terakhir, cabe jawa dipercaya dapat melancarkan peredaran darah dan menambah nafsu makan \n" +
                        "Cabe jawa alias cabe puyang juga bermanfaat untuk melancarkan sistem peredaran darah. Apalagi jika cabe jawa dibuat menjadi jamu dan diminum secara teratur. Selain itu, cabe jawa juga akan menambah nafsu makan dan cocok buatmu yang sedang menjalani program menaikkan berat badan. Hal itu disebabkan karena cabe jawa membantu sistem pencernaan sehingga makanan tetap diolah dengan baik dalam tubuh. \n" +
                        "Nah, itu dia beberapa manfaat yang bisa kamu dapatkan jika mengonsumsi cabe jawa. Kita patut bersyukur mengingat di Indonesia bibit cabe jawa bisa ditemukan dengan mudah dan bisa ditanam sendiri. Tapi kalau nggak mau repot, beli di pasar juga banyak kok",
                "2 min",
                "www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "12",
                " 5 Tanaman Hidroponik yang Cepat Panen Plus Cara Merawatnya. Gampang dan Cocok untuk Pemula",
                " Selain bersepeda, kegiatan berkebun semakin diminati orang-orang belakangan ini.",
                R.drawable.img12,
                " Selain bersepeda, kegiatan berkebun semakin diminati orang-orang belakangan ini. Salah satu tujuannya adalah menikmati sayuran dan buah-buahan yang ditanam sendiri. Berkebun juga dianggap bisa membuat perasaan jadi lebih rileks. Itulah yang membuat banyak orang mencoba berkebun dengan modal seadanya. Apalagi kita nggak perlu lagi menyediakan lahan yang luas. Pasalnya, ada sistem hidroponik yang menggunakan air sebagai media tanam. Jadi kita bisa melakukannya di manapun, bahkan di perkotaan yang penuh sesak. \n" +
                        "Kata hidroponik berasal dari hydro yang artinya air. Jadi tanaman hidroponik adalah tanaman yang menggunakan air sebagai media tumbuhnya. Tanaman hidroponik diletakkan di tempat yang mudah terkena cahaya agar berkembang maksimal. Berbeda dengan tanaman biasa yang menggunakan tanah, jenis tanaman ini bisa memakai berbagai media \n" +
                        "Yuk pilih jenis tanaman hidroponik yang cepat panen!\n" +
                        "1. Pakcoy \n" +
                        "Sayuran ini sangat cocok untuk dijadikan masakan tumisan. Sekarang kamu nggak perlu membelinya lagi, cukup tanam sendiri dengan metode hidroponik. Pastikan agar tanaman mendapat aliran air dan nutrisi yang cukup. Sekitar 20 hari setelah ditanam, kamu sudah bisa memanen pakcoy.\n" +
                        "2. Kangkung \n" +
                        "Sayuran ini bisa tumbuh di media tanah maupun air. Jadi kangkung sangat cocok untuk ditanam dengan sistem hidroponik. Pertumbuhannya juga relatif cepat. Kamu sudah bisa memanennya dalam 4-6 minggu! Kualitas tanaman hidroponik kangkung juga lebih bagus dibandingkan kangkung biasa.\n" +
                        "3. Seledri \n" +
                        "Seledri cocok hidup dalam media air. Kamu bisa menanamnya dengan sistem hidroponik rakit apung. Seperti kangkung, seledri sudah bisa dipanen dalam waktu 4-6 minggu. Pemanenan bisa diulang setiap 5-6 hari sekali. Caranya, cabut seledri dari wadah yang digunakan. Lalu pisahkan anakan seledri untuk ditanam kembali.\n" +
                        "4. Tomat \n" +
                        "Nggak perlu lahan yang luas untuk menanam tomat. Dengan pot dan paralon, kamu sudah bisa merawat tanaman hidroponik tomat. Rasa dan kandungan nutrisinya juga tetap terjaga. Setelah biji tomat disemai dan ditanam, kamu membutuhkan waktu 2-3 bulan untuk bisa memanennya.\n" +
                        "5. Cabai \n" +
                        "Sebelum ditanam, biji cabai harus disemai dulu. Lalu pindahkan pada media tanam yang biasanya menggunakan arang sekam. Jangan lupa alirkan air secara berkala supaya akarnya mendapat nutrisi. Lalu kapan bisa menikmati hasilnya? Kamu bisa memanen tanaman hidroponik cabai kalau sudah memasuki umur 80-90 hari. Waktu terbaik untuk memanennya adalah pagi dan sore. \n" +
                        "Itulah berbagai jenis tanaman hidroponik yang bisa cepat dipanen. Kalau menanam dalam skala kecil, hasilnya bisa dimakan sendiri. Pasti puas deh karena kita sudah menghabiskan banyak waktu dan tenaga untuk merawatnya. Lalu bagaimana kalau menanam dalam skala besar? Karena hasilnya lebih banyak, kamu bisa membaginya dengan orang-orang lain atau menjualnya. Lumayan kan kalau bisa menghasilkan uang dari hobi berkebun! \n" +
                        "Itulah berbagai jenis tanaman hidroponik yang bisa cepat dipanen. Kalau menanam dalam skala kecil, hasilnya bisa dimakan sendiri. Pasti puas deh karena kita sudah menghabiskan banyak waktu dan tenaga untuk merawatnya. Lalu bagaimana kalau menanam dalam skala besar? Karena hasilnya lebih banyak, kamu bisa membaginya dengan orang-orang lain atau menjualnya. Lumayan kan kalau bisa menghasilkan uang dari hobi berkebun!.",
                "2 min",
                "www.hipwee.com"
            )
        )

        articles.add(
            ArticleEntity(
                "13",
                " Tumbuhan adalah salah satu dari klasifikasi makhluk hidup",
                " Tumbuhan memiliki klorofil atau zat hijau daun yang memiliki fungsi sebagai media untuk menciptakan sebuah makanan dan sebagai proses berfotosintesis.",
                R.drawable.img13,
                " Tumbuhan memiliki klorofil atau zat hijau daun yang memiliki fungsi sebagai media untuk menciptakan sebuah makanan dan sebagai proses berfotosintesis. \n" +
                        "Dalam ilmu biologi, tumbuhan merupakan termasuk dalam organisme yang disebut Regnum Plantae yang merupakan sebuah organisme multiseluler atau terdiri atas banyak sel. \n" +
                        "Tercatat sekitar 350.000 lebih spesies tumbuhan, dari jumlah yang telah disebutkan tersebut terdapat 258.000 jenis, merupakan sebuah tumbuhan berbunga dan 18.000 lainnya merupakan jenis tumbuhan lumut. Hampir semua anggota tumbuhan memiliki sifat autotrof dan mendapatkan energi langsung dari cahaya matahari, dengan melalui proses fotosintesis. \n" +
                        "Ciri ciri yang mudah dikenali pada tumbuhan hijau yang dominan akibat sebuah kandungan pigmen klorofil yang memiliki peran vital dalam proses penangkapan energi melalui fotosintesis sehingga tumbuhan secara umum bersifat autotrof. \n" +
                        "Beberapa pengecualian, misalnya pada sejumlah tumbuhan parasit. Hal ini terjadi karena diakibatkan oleh adaptasi pada cara hidup juga lingkungan yang unik. Sifat autotrof yang dimiliki membuat tumbuhan tersebut selalu menempati posisi yang pertama pada rantai aliran energi melalui organisme hidup (Rantai Makanan). \n" +
                        "Tumbuhan ini memiliki sifat stasioner yang artinya tidak dapat berpindah tempat dengan sendirinya, walaupun beberapa alga hijau memiliki sifat motil atau mampu berpindah tempat karena memiliki flagelum. \n" +
                        "Karena memiliki sifat yang pasif alias tidak dapat berpindah tempat maka tumbuhan harus beradaptasi secara fisik atas perubahan lingkungan juga gangguan yang terjadi padanya. Variasi morfologi tumbuhan ini jauh lebih besar dibandingkan dengan lainnya.",
                "1 min",
                "www. utakatikotak.com"
            )
        )

        articles.add(
            ArticleEntity(
                "14",
                " Kepunahan tidak hanya mengancam satwa Indonesia, tetapi juga berbagai jenis tumbuhannya",
                " Sebagai generasi penerus bangsa, sudah seharusnya kita mengetahui penyebab dibalik adanya ancaman kepunahan terhadap tumbuhan di Indonesia ini..",
                R.drawable.img14,
                " Sebagai generasi penerus bangsa, sudah seharusnya kita mengetahui penyebab dibalik adanya ancaman kepunahan terhadap tumbuhan di Indonesia ini. Tujuannya adalah agar dapat mengantisipasi ataupun melakukan gerakkan perubahan agar alam di negeri kita tetap lestari tanpa adanya kepunahan pada berbagai jenis flora kita. Berikut beberapa ulasan tentang faktor-faktor yang dapat mempengaruhi kestabilan dan keberadaan tanaman di hutan Indonesia :\n" +
                        "1. Alih Fungsi Lahan \n" +
                        "Alih fungsi lahan sebagai pemenuh keperluan perkebunan, pertanian, perumahan dan pembangunan infrastruktur telah terjadi di berbagai daerah di seluruh tanah air. Adanya alih fungsi lahan ini tentu mempengaruhi habitat tanaman Indonesia yang kian menurun. Akibatnya, tumbuhan mengalami krisis lahan yang menyebabkan kepunahan.\n" +
                        "2. Pencemaran Ekosistem \n" +
                        "Pencemaran ekosistem seperti limbah industri (baik udara, air, dan darat) yang masih sering terjadi, kemudian bencana alam seperti gunung meletus, tanah longsor, dan tsunami juga berperan sebagai penyebab kepunahan tumbuhan di Indonesia. Untuk itu, sudah seharusnya perusahaan-perusahaan bersikap bijak dengan mengolah limbah terlebih dahulu agar tidak mencemari lingkungan.\n" +
                        "3. Penebangan Liar \n" +
                        "Tingginya permintaan kayu di Indonesia membuat banyak pihak lalai. Mereka melakukan penebangan pohon secara liar tanpa menanam kembali sehingga populasi tumbuhan di Indonesia kian berkurang drastis. Selain berbahaya bagi kelestarian tumbuhan, kegiatan penebangan liar ini juga dapat menimbulkan resiko bencana alam seperti banjir dan tanah longsor.\n" +
                        "4. Penggunaan Pestisida Secara Berlebihan \n" +
                        "Penggunaan pestisida bagi tanaman tentu sudah tidak terdengar asing bagi masyarakat. Akan tetapi, jika pestisida anorganik digunakan secara berlebihan justru dapat menimbulkan kepunahan bagi tanaman. Hal ini disebabkan karena pestisida kimia dapat menyebabkan pencemaran tanah, merusak kualitas tanaman serta mengganggu siklus rantai makanan.",
                "2 min",
                "www. dlh.semarangkota.go.id"
            )
        )

        articles.add(
            ArticleEntity(
                "15",
                " Dari jutaan jenis tumbuhan yang hidup di Indonesia, beberapa di antaranya dikategorikan sebagai tumbuhan langka",
                " Tumbuhan langka di Indonesia yang terancam punah.",
                R.drawable.img14,
                " Tumbuhan  langka di Indonesia yang terancam punah. \n" +
                        "Kabar duka ini tak hanya menjadi perhatian bagi para pegiat dan pihak-pihak pemerhati flora di Indonesia. \n" +
                        "Lebih jauh lagi, seharusnya hal ini juga menjadi fokus bersama antara pemerintah dan warganya. \n" +
                        "Soalnya, kekayaan flora di Indonesia merupakan warisan tak-benda yang sama-sama harus dijaga dan dilestarikan. \n" +
                        "Apalagi banyak tumbuhan langka di Indonesia yang sangat unik dan tak bisa ditemukan di tempat lain di dunia ini selain di Indonesia. \n" +
                        "Salah satunya adalah bunga padma raksasa atau bunga Rafflesia Arnoldi yang sudah sangat tersohor di dunia. \n" +
                        "Selain itu, masih ada beberapa jenis tumbuhan langka di Indonesia yang kini statusnya sudah terancam punah dan harus kita jaga bersama-sama. \n" +
                        "Berikut ini daftar lengkap tumbuhan langka di Indonesia yang sudah terancam punah.\n" +
                        "7 Tumbuhan Langka di Indonesia yang Terancam Punah\n" +
                        "1. Bunga Padma Raksasa (Rafflesia arnoldii)\n" +
                        "2. Edelweiss Jawa (Anaphalis javanic)\n" +
                        "3. Bunga Bangkai (Amorphophallus titanum)\n" +
                        "4. Pohon Damar (Agathis dammara)\n" +
                        "5. Kantong Semar (Nepenthes)\n" +
                        "6. Pohon Ulin (Eusideroxylon zwageri Teijsm & Binn)\n" +
                        "7. Pohon Anggrek Tebu (Grammatophyllum speciosum).",
                "1 min",
                " www.99.co"
            )
        )
        return articles
    }

    fun generateStoreList(): ArrayList<StoreEntity> {
        val storeList = ArrayList<StoreEntity>()

        storeList.add(
            StoreEntity(
                "1",
                "PD.RAJA HARUM MULYA SAYUR MAYUR. PASAR BALONG",
                "Jl. Raya K H Abdul Halim No.191 - 700 m",
                "+6285721836588"
            )
        )

        storeList.add(
            StoreEntity(
                "2",
                "KIWW SAYUR!!",
                "Cicurug - 2,8 km",
                "+6283120620666"
            )
        )

        storeList.add(
            StoreEntity(
                "3",
                "Didin Sayur",
                "Pasar Cigasong - 3,1 km",
                "+6281802390391"
            )
        )

        storeList.add(
            StoreEntity(
                "4",
                "Kios Ka Asih",
                "Jl. Pejuang No.35 - 3,3 km",
                "+6282130766980"
            )
        )

        storeList.add(
            StoreEntity(
                "5",
                "Rumah Buah",
                "Cigasong - 4,2 km",
                "+6281324055464"
            )
        )

        storeList.add(
            StoreEntity(
                "6",
                "Azzura Fruit",
                "Jl. Kh. Abdul Halim - 4,4 km",
                "+6285221133777"
            )
        )

        storeList.add(
            StoreEntity(
                "7",
                "Toko Sayur",
                "Heuleut, Kec. Kadipaten - 8,0 km",
                "+6285520736343"
            )
        )

        storeList.add(
            StoreEntity(
                "8",
                "Toko Azka",
                "Jl. Majalengka-Kadipaten No.184 - 10,3 km",
                "+6282128207878"
            )
        )

        storeList.add(
            StoreEntity(
                "9",
                "Asas Buah",
                "Cijeunjing, Sumedang - 11,3 km",
                "+6282116555563"
            )
        )

        storeList.add(
            StoreEntity(
                "10",
                "Rosid Buah",
                "Jl. Raya Cirebon - 12,4 km",
                "+6285222881788"
            )
        )

        storeList.add(
            StoreEntity(
                "11",
                "HSB BUAH",
                "Jl. K.H. Aqsho, Kece, Rajagaluh - 17,8 km",
                "+6283107766130"
            )
        )

        storeList.add(
            StoreEntity(
                "12",
                "Toko All Buah",
                "Baturuyuk, Dawuan - 19,3 km",
                "+6282116246889"
            )
        )

        storeList.add(
            StoreEntity(
                "13",
                "Toko Buah Terminal Buah Putra Galuh",
                "Legok Kaler, Kec. Paseh, Sumedang - 34,8 km",
                "+6281321765878"
            )
        )
        return storeList
    }
}
