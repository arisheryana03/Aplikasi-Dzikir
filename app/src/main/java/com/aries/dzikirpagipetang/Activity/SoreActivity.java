package com.aries.dzikirpagipetang.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.aries.dzikirpagipetang.R;
import com.aries.dzikirpagipetang.ViewPager.ViewPagerAdapterPT;

public class SoreActivity extends AppCompatActivity {

    String[] judul={
            "[1] Membaca ayat Kursi"
            ,"[2] Membaca surat Al Ikhlas, Al Falaq, An Naas"
            ,"[3]"
            ,"[4]"
            ,"[5] Membaca Sayyidul Istighfar"
            ,"[6]"
            ,"[7]"
            ,"[8]"
            ,"[9]"
            ,"[10]"
            ,"[11]"
            ,"[12]"
            ,"[13]"
            ,"[14]"
            ,"[15]"
    };

    String keteranaganarab[] ={
            "أَعُوذُ بِاللَّهِ مِنْ الشَّيْطَانِ الرَّجِيم\nِ\nاللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ\n"
            ,"بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
            "\n" +
            "قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ\n" +
            "\n" +
            "\n" +
            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
            "\n" +
            "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ  وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ\n" +
            "\n" +
            "\n" +
            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
            "\n" +
            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ مَلِكِ النَّاسِ إِلَهِ النَّاسِ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ مِنَ الْجِنَّةِ وَ النَّاسِ\n" +
            "\n" +
            "\n"
            ," أَمْسَيْنوَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ\n" +
            "\n"
            ,"اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ\n" +
            "\n"
            ,"اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ.\n" +
            "\n"
            ,"اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ\n" +
            "\n"
            ,"اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ\n" +
            "\n"
            ,"\n اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ" +
            "\n"
            ,"بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ\n" +
            "\n"
            ,"رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا\n" +
            "\n"
            ,"يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا\n" +
            "\n"
            ,"أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ\n" +
            "\n"
            ,"سُبْحَانَ اللهِ وَبِحَمْدِهِ\n" +
            "\n"
            ,"لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ\n" +
            "\n"
            ,"أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَاً\n" +
            "\n"

    };

    String keteranganindo[] ={
            "“Aku berlindung kepada Allah dari godaan syaitan yang terkutuk.\n\n”Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255) (Dibaca 1 x)\n" +
                    "\n" +
                    "Faedah:\nSiapa yang membacanya ketika petang, maka ia akan dilindungi (oleh Allah dari berbagai gangguan) hingga pagi. Siapa yang membacanya ketika pagi, maka ia akan dilindungi hingga petang.\nHR. Al Hakim(1:562). Syaikh Al Albani menshahihkan hadist tersebut dalam Shahih At Targhib wa At Tarhib no 655.\n" +
                    "\n" +
                    "\n"
            ,"“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4) (Dibaca 3 x)\n" +
            "\n" +
            "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. (QS. Al Falaq: 1-5) (Dibaca 3 x)\n" +
            "\n" +
            "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” (QS. An Naas: 1-6) (Dibaca 3 x)\n" +
            "\n" +
            "Faedah:\nSiapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.\nHR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadist ini hasan.\n" +
            "\n"
            ,"“Kami telah memasuki waktu sore dan kerajaan hanya milik Allah, segala puji hanya milik Allah. Tidak ada Ilah yang berhak diibadahi dengan benar kecuali Allah Yang Maha Esa, tiada sekutu bagi-Nya. Bagi-Nya kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabb, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabb, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabb, aku berlindung kepada-Mu dari siksaan di Neraka dan siksaan di kubur.”(Dibaca Sore 1x)\n" +
            "\n" +
            "Faedah:\nMeminta pada Allah kebaikan di malam ini dan kebaikan sesudahnya, juga agar terhindar dari kejelekan di malam ini dan kejelekan sesudahnya. Di dalamnya berisi pula permintaan agar terhindar dari rasa malas padahal mampu untuk beramal, juga agar terhindar dari kejelekan di masa tua. Di dalamnya juga berisi permintaan agar terselamatkan dari siksa kubur dan siksa neraka yang merupakan siksa terberat di hari kiamat kelak.\nHR. Muslim no.2723. Lihat keterangan Syarh Hisnul Muslim, hal 161.\n" +
            "\n" +
            "\n"
            ,"“Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu petang. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk).” (Dibaca 1 x)\n" +
            "\n" +
            "Faedah:\nHR. Tirmidzi no. 3391 dan Abu Daud no. 5068. Al Hafidz Abu Thohir mengatakan bahwa sanad hadist ini shahih.\n" +
            "\n"
            ,"“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.”\n" +
            "\n" +
            "Faedah:\nBarangsiapa mengucapkan dzikir ini di siang hari dalam keadaan penuh keyakinan, lalu ia mati pada hari tersebut sebelum petang hari, maka ia termasuk penghuni surga. Barangsiapa yang mengucapkannya di malam hari dalam penuh keyakinan, lalu ia meninggal sebelum pagi, maka ia termasuk penghuni surga.\nHR. Bukhari no. 6306.\n" +
            "\n"
            ,"“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).” (Dibaca 1 x)\n" +
            "\n" +
            "Faedah:\nRasulullah shallallahu ‘alaihi wa sallam tidaklah pernah meninggalkan do’a ini di pagi dan petang hari. Di dalamnya berisi perlindungan dan keselamatan pada agama, dunia, keluarga dan harta dari berbagai macam gangguan yang datang dari berbagai arah.\nHR. Abu Daud no .5074 dan Ibnu Majah no.3871. Al Hafizh Abu Thohir mengatakan bahwa sanad hadist ini shahih.\n" +
            "\n" +
            "\n"
            ,"“Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.” (Dibaca 1 x)\n" +
            "\n" +
            "Faedah:\nDo’a ini diajarkan oleh Rasulullah shallallahu ‘alaihi wa sallam pada Abu Bakr Ash Shiddiq radhiyallahu ‘anhu untuk dibaca pada pagi, petang dan saat beranjak tidur.\nHR. Tirmidzi no. 3392 dan Abu Daud no. 5067. Al Hafizh Abu Thohir mengatakan bahwa sanad hadist ini shahih.\n" +
            "\n" +
            "\n"
            ,"“Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.” (Dibaca pagi dan sore 3x)\n" +
            "\n" +
            "Faedah:\nHR. Al-Bukhari dalam Shahib Al-Adabil Mufrad no. 701, Abu Daud no. 5090, Ahmad V/42, hasan. Lihat Shahih Al-Adabil Mufrad no. 539.\n" +
            "\n"
            ,"“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” (Dibaca 3 x)\n" +
            "\n" +
            "Faedah:\nBarangsiapa yang mengucapkan dzikir tersebut sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka tidak akan ada bahaya yang tiba-tiba memudaratkannya.\nHR. Abu Daud no. 5088,5089, Tirmidzi no. 3388, dan Ibnu Majah no. 3869. Al Hafizh Abu Thohir mengatakan bahwa sanad hadist ini hasan.\n" +
            "\n" +
            "\n"
            ,"“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.” (Dibaca 3 x)\n" +
            "\n" +
            "Faedah:\nBarangsiapa yang mengucapkan dzikir ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.\nHR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadist ini hasan.\n" +
            "\n" +
            "\n"
            ,"“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).” (Dibaca 1 x)\n" +
            "\n" +
            "Faedah:\nDzikir ini diajarkan oleh Nabi shallallahu ‘alaihi wa sallam pada Fathimah supaya diamalkan pagi dan petang.\nHR. Ibnu As Sunni dalam'Amalul Yaum wal Lailah no. 46, An Nasai dalam Al Kubro (381/570), Al Bazzar dalam musnadnya (4/25/3107), Al Hakim (1:545). Sanad hadist ini hasan sebagaimana dikatakan oleh Syaikh Al Albani dalam As Silsilah Ash Shahihah no. 227.\n" +
            "\n" +
            "\n"
            ,"“Di waktu sore kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.” (Dibaca 1 x)\n" +
            "\n"
            ,"“Maha suci Allah, aku memuji-Nya.” (Dibaca 100 x)\n" +
            "\n" +
            "Faedah:\nBarangsiapa yang mengucapkan kalimat ‘subhanallah wa bi hamdih’ di pagi dan petang hari sebanyak 100 x, maka tidak ada yang datang pada hari kiamat yang lebih baik dari yang ia lakukan kecuali orang yang mengucapkan semisal atau lebih dari itu.\nHR. Muslim no. 2692\n" +
            "\n" +
            "\n"
            ,"“Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.” (Dibaca 100 x dalam sehari)\n" +
            "\n" +
            "Faedah:\nFaedah 1 : Barangsiapa yang membaca dzikir tersebut di pagi hari sebanyak 10x, Allah akan mencatatkan baginya 10 kebaikan, menghapuskan baginya 10 kesalahan, ia juga mendapatkan kebaikan semisal memerdekakan 10 budak, Allah akan melindunginya dari gangguan setan hingga petang hari. Siapa yang mengucapkannya di petang hari, ia akan mendapatkan keutamaan semisal itu pula. HR. An Nasai Al Kubro 6:10.\n\nFaedah 2 :Barangsiapa yang mengucapkan dzikir tersebut dalam sehari sebanyak 100x, maka itu seperti membebaskan 10 orang budak, dicatat baginya 100 kebaikan, dihapuskan baginya 100 kesalahan, dirinya akan terjaga dari gangguan setan dari pagi hingga petang hari, dan tidak ada seorang pun yang lebih baik dari yang ia lakukan kecuali oleh orang yang mengamalkan lebih dari itu. HR. Bukhori no. 3293 dan Muslim no. 2961. \n" +
            "\n" +
            "\n"
            ,"““Aku berlindung dengan kalimat-kalimat Allah yang sempurna, dari kejahatan sesuatu yang diciptakan-Nya.” (Dibaca sore 3x)\n" +
            "\n" +
            "Faedah:\nSiapa yang mengucapkannya di petang hari, niscaya tidak ada racun atau binatang (seperti:kalajengking) yang mencelakakannya di malam itu.\nHR. Ahmad 2:290. Syaikh Syu'aib Al Arnauth mengatakan bahwa sanad hadist ini shahih sesuai syarat Muslim. Lihat komentar Syaikh Syu'aib Al Arnauth terhadap hadist ini untuk pengertian hummah diartikan dengan racun atau sengatan kalajengking.\n" +
            "\n"

    };

    PagerAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sore);

        getSupportActionBar().setTitle("Dzikir Petang");

        //Add button back
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager)findViewById(R.id.sore);

        adapter = new ViewPagerAdapterPT(SoreActivity.this, judul, keteranaganarab, keteranganindo);
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home);
        this.finish();
        return super.onOptionsItemSelected(item);
    }
}
