package com.yusufduman.worldculture;

import java.util.HashMap;
import java.util.Map;

public class Lists {

    public HashMap<String , String> Europe = new HashMap<>();
    public HashMap<String,String> Asia = new HashMap<>();
    public HashMap<String,String> North = new HashMap<>();
    public HashMap<String,String> South = new HashMap<>();
    public HashMap<String,String> Africa = new HashMap<>();
    public HashMap<String,String> All = new HashMap<>();

    public void setEurope(String difficulty , String lang) {


        if (lang.equals("Avrupa")){

            if (difficulty.equals("Easy")){
                Europe.put ("Türkiye", "Ankara");
                Europe.put ("İngiltere", "Londra");
                Europe.put ("Macaristan", "Budapeşte");
                Europe.put ("İspanya", "Madrid");
                Europe.put ("Almanya", "Berlin");
                Europe.put ("Fransa", "Paris");
                Europe.put ("İtalya", "Roma");
                Europe.put ("Danimarka", "Kopenhag");
                Europe.put ("Hollanda", "Amsterdam");
                Europe.put ("Norveç", "Oslo");
                Europe.put ("Polonya", "Varşova");
                Europe.put ("Portekiz", "Lizbon");
                Europe.put ("Rusya", "Moskova");
                Europe.put ("İsveç", "Stockholm");
                Europe.put ("İsviçre", "Bern");
                Europe.put ("Ukrayna", "Kiev");
                Europe.put ("Avusturya", "Viyana");
                Europe.put ("Finlandiya", "Helsinki");
                Europe.put ("Sırbistan", "Belgrad");
                Europe.put ("Hırvatistan", "Zagreb");
            }
            else {
                Europe.put ("Arnavutluk", "Tiran");
                Europe.put ("Andorra", "Andorra la Vella");
                Europe.put ("Belarus", "Minsk");
                Europe.put ("Belçika", "Brüksel");
                Europe.put ("Bosna Hersek", "Saraybosna");
                Europe.put ("Bulgaristan", "Sofya");
                Europe.put ("Çek Cumhuriyeti", "Prag");
                Europe.put ("Estonya", "Tallin");
                Europe.put ("Yunanistan", "Atina");
                Europe.put ("İzlanda", "Reykjavik");
                Europe.put ("İrlanda", "Dublin");
                Europe.put ("Kosova", "Priştine");
                Europe.put ("Letonya", "Riga");
                Europe.put ("Litvanya", "Vilnius");
                Europe.put ("Lüksemburg", "Lüksemburg");
                Europe.put ("Malta", "Valetta");
                Europe.put ("Moldova", "Kişinev");
                Europe.put ("Monako", "Monako");
                Europe.put ("Karadağ", "Podgorica");
                Europe.put ("Makedonya", "Üsküp");
                Europe.put ("Romanya", "Bükreş");
                Europe.put ("San Marino", "San Marino");
                Europe.put ("Slovakya", "Bratislava");
                Europe.put ("Slovenya", "Ljubljana");
                Europe.put ("Vatikan", "Vatikan Şehri");
            }


        }
        else {


            if (difficulty.equals("Easy")){
                Europe.put("Turkey", "Ankara");
                Europe.put("England", "London");
                Europe.put("Hungary", "Budapest");
                Europe.put("Spain", "Madrid");
                Europe.put("Germany", "Berlin");
                Europe.put("France", "Paris");
                Europe.put("Italy", "Rome");
                Europe.put("Denmark", "Copenhagen");
                Europe.put("Netherlands", "Amsterdam");
                Europe.put("Norway", "Oslo");
                Europe.put("Poland", "Warsaw");
                Europe.put("Portugal", "Lisbon");
                Europe.put("Russia", "Moscow");
                Europe.put("Sweden", "Stockholm");
                Europe.put("Switzerland", "Bern");
                Europe.put("Ukraine", "Kiev");
                Europe.put("Austria", "Vienna");
                Europe.put("Finland", "Helsinki");
                Europe.put("Serbia", "Belgrade");
                Europe.put("Croatia", "Zagreb");

            }

            else {

                Europe.put("Albania","Tirana");
                Europe.put("Andorra", "Andorra la Vella");
                Europe.put("Belarus", "Minsk");
                Europe.put("Belgium", "Brussels");
                Europe.put("Bosna Herzegovina", "Sarajevo");
                Europe.put("Bulgaria", "Sofia");
                Europe.put("Czech Republic", "Prague");
                Europe.put("Estonia", "Tallinn");
                Europe.put("Greece", "Athens");
                Europe.put("Iceland", "Reykjavik");
                Europe.put("Ireland", "Dublin");
                Europe.put("Kosovo", "Pristina");
                Europe.put("Latvia", "Riga");
                Europe.put("Lithuania", "Vilnius");
                Europe.put("Luxembourg", "Luxembourg");
                Europe.put("Malta", "Valetta");
                Europe.put("Moldova", "Chisinau");
                Europe.put("Monaco", "Monaco");
                Europe.put("Montenegro", "Podgorica");
                Europe.put("Macedonia", "Skopje");
                Europe.put("Romania", "Bucharest");
                Europe.put("San Marino", "San Marino");
                Europe.put("Slovakia", "Bratislava");
                Europe.put("Slovenia", "Ljubljana");
                Europe.put("Vatican", "Vatican City");
            }
        }



    }

    public HashMap<String,String> getEurope(String mode) {

        if (mode.equals("Capital")) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : Europe.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            Europe.clear();
            Europe.putAll(newMap);
            newMap.clear();
        }
        else {
        }
        return Europe;
    }


///////////////////////////////////////////////    ASİA    /////////////////////////////////////////////////

    public void setAsia(String difficulty, String lang){

        if (lang.equals("Avrupa")){
            if (difficulty.equals ("Easy")) {
                Asia.put ("Çin", "Pekin");
                Asia.put ("İran", "Tahran");
                Asia.put ("Suriye", "Şam");
                Asia.put ("Azerbaycan", "Bakü");
                Asia.put ("Japonya", "Tokyo");
                Asia.put ("Hindistan", "Yeni Delhi");
                Asia.put ("Kazakistan", "Astana");
                Asia.put ("Afganistan", "Kabil");
                Asia.put ("Irak", "Bağdat");
                Asia.put ("Lübnan", "Beyrut");
                Asia.put ("Katar", "Doha");
                Asia.put ("Rusya", "Moskova");
                Asia.put ("Türkiye", "Ankara");
                Asia.put ("Filistin", "Kudüs");
                Asia.put ("Suudi Arabistan", "Riyad");
                Asia.put ("Güney Kore", "Seul");
                Asia.put ("Birleşik Arap Emirlikleri", "Abu Dabi");
                Asia.put ("Özbekistan", "Taşkent");
                Asia.put ("İsrail", "Tel Aviv");
                Asia.put ("Singapur", "Singapur");

            }
            else {
                Asia.put ("Ermenistan", "Erivan");
                Asia.put ("Bahreyn", "Manama");
                Asia.put ("Bangladeş", "Dakka");
                Asia.put ("Kamboçya", "Punom Pen");
                Asia.put ("Gürcistan", "Tiflis");
                Asia.put ("Endonezya", "Cakarta");
                Asia.put ("Ürdün", "Amman");
                Asia.put ("Kuveyt", "Kuveyt Şehri");
                Asia.put ("Kırgızistan", "Bişkek");
                Asia.put ("Malezya", "Kuala Lumpur");
                Asia.put ("Maldivler", "Male");
                Asia.put ("Moğolistan", "Ulanbator");
                Asia.put ("Myanmar", "Nepido");
                Asia.put ("Nepal", "Katmandu");
                Asia.put ("Kuzey Kore", "Pyongyang");
                Asia.put ("Umman", "Maskat");
                Asia.put ("Filipinler", "Manila");
                Asia.put ("Tayvan", "Taipei");
                Asia.put ("Tacikistan", "Duşanbe");
                Asia.put ("Tayland", "Bangkok");
                Asia.put ("Türkmenistan", "Aşkabat");
                Asia.put ("Vietnam", "Hanoi");
                Asia.put ("Yemen", "Sana'a");
                Asia.put("Pakistan" , "İslamabat");
                Asia.put("Sri Lanka" , "Sri Jayawardenapura-Kotte");

            }
        }


        else {

            if (difficulty.equals("Easy")) {
                Asia.put("China", "Beijing");
                Asia.put("Iran", "Tehran");
                Asia.put("Syria", "Damascus");
                Asia.put("Azerbaijan", "Baku");
                Asia.put("Japan", "Tokyo");
                Asia.put("India", "New Delhi");
                Asia.put("Kazakhstan", "Astana");
                Asia.put("Afghanistan", "Kabul");
                Asia.put("Iraq", "Baghdad");
                Asia.put("Lebanon", "Beirut");
                Asia.put("Qatar", "Doha");
                Asia.put("Russia", "Moscow");
                Asia.put("Turkey", "Ankara");
                Asia.put("Palastine", "Jerusalem");
                Asia.put("Saudi Arabia", "Riyadh");
                Asia.put("South Korea", "Seoul");
                Asia.put("United States Emirates", "Abu Dhabi");
                Asia.put("Uzbekistan", "Tashkent");
                Asia.put("Israel", "Tel Aviv");
                Asia.put("Singapore", "Singapore");

            } else {

                Asia.put("Armenia", "Yerevan");
                Asia.put("Bahrain", "Manama");
                Asia.put("Bangladesh", "Dhaka");
                Asia.put("Cambodia", "Phnom Penh");
                Asia.put("Georgia", "Tbilisi");
                Asia.put("Indonesia", "Jakarta");
                Asia.put("Jordan", "Amman");
                Asia.put("Kuwait", "Kuwait City");
                Asia.put("Kyrgyzistan", "Bishkek");
                Asia.put("Malaysia", "Kuala Lumpur");
                Asia.put("Maldives", "Male");
                Asia.put("Mongolia", "Ulaanbataar");
                Asia.put("Myanmar", "Naypyidaw");
                Asia.put("Nepal", "Kathmandu");
                Asia.put("North Korea", "Pyongyang");
                Asia.put("Oman", "Muscat");
                Asia.put("Philippines", "Manila");
                Asia.put("Taiwan", "Taipei");
                Asia.put("Tajikistan", "Dushanbe");
                Asia.put("Thailand", "Bangkok");
                Asia.put("Turkmenistan", "Ashgabat");
                Asia.put("Vietnam", "Hanoi");
                Asia.put("Yemen", "Sana'a");
                Asia.put("Pakistan" , "İslamabad");
                Asia.put("Sri Lanka" , "Sri Jayawardenapura-Kotte");

            }

        }

    }

    public HashMap<String,String> getAsia(String mode){

        if (mode.equals("Capital")) {
            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : Asia.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            Asia.clear();
            Asia.putAll(newMap);
            newMap.clear();
        }
        else {

        }

        return Asia;
    }

    ///////////////////////////////////////////////    NORTH    /////////////////////////////////////////////////

    public void setNorth(String difficulty,String lang){


        if (lang.equals("Avrupa")){
            if (difficulty.equals("Easy")) {
                North.put ("Kanada", "Ottowa");
                North.put ("Amerika Birleşik Devletleri", "Washington DC");
                North.put ("Panama", "Panama Şehri");
                North.put ("Meksika", "Mexico City");
                North.put ("El Salvador", "San Salvador");
                North.put ("Kosta Rika", "San Jose");
                North.put ("Küba", "Havana");
                North.put ("Honduras", "Tegucigalpa");
                North.put ("Haiti", "Port-au-Prince");
                North.put ("Jameica", "Kingston");

            }else {
                North.put ("Bahamalar", "Nassau");
                North.put ("Barbados", "Bridgetown");
                North.put ("Belize", "Belmopan");
                North.put ("Dominika", "Roseau");
                North.put ("Dominik Cumhuriyeti", "Santo Domingo");
                North.put ("Grenada", "Aziz George");
                North.put ("Guatemala", "Guatemala Şehri");
                North.put ("Nikaragua", "Managua");
                North.put ("Saint Lucia", "Castries");
            }




        }
        else{
            if (difficulty.equals("Easy")){
                North.put("Canada" , "Ottowa");
                North.put("United States of America" , "Washington DC");
                North.put("Panama" , "Panama City");
                North.put("Mexico" , "Mexico City");
                North.put("El Salvador" , "San Salvador");
                North.put("Costa Rica" , "San Jose");
                North.put("Cuba" , "Havana");
                North.put("Honduras" , "Tegucigalpa");
                North.put("Haiti" , "Port-au-Prince");
                North.put("Jameica" , "Kingston");

            }
            else{
                North.put("Bahamas" , "Nassau");
                North.put("Barbados" , "Bridgetown");
                North.put("Belize" , "Belmopan");
                North.put("Dominica" , "Roseau");
                North.put("Dominican Republic" , "Santo Domingo");
                North.put("Grenada" , "Saint George's");
                North.put("Guatemala" , "Guatemala City");
                North.put("Nicaragua" , "Managua");
                North.put("Saint Lucia" , "Castries");
            }
        }










    }

    public HashMap<String,String> getNorth(String mode){

        if (mode.equals("Capital")) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : North.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            North.clear();
            North.putAll(newMap);
            newMap.clear();
        }
        else {
        }

        return North;
    }

    ///////////////////////////////////////////////    SOUTH    /////////////////////////////////////////////////

    public void setSouth(String difficulty , String lang){



        if (lang.equals("Avrupa")){

            if (difficulty.equals("Easy")){
                South.put ("Brezilya", "Brasilia");
                South.put ("Arjantin", "Buenos Aires");
                South.put ("Şili", "Santiago");
                South.put ("Peru", "Lima");
                South.put ("Kolombiya", "Bogota");
                South.put("Bolivya" , "Sucre");
            }else {
                South.put ("Ekvador", "Quito");
                South.put ("Paraguay", "Asuncion");
                South.put ("Surinam", "Paramaribo");
                South.put ("Uruguay", "Montevideo");
                South.put ("Vanezuela", "Karakas");
                South.put ("Guyana", "GeorgeTown");
            }

        }


        else {

            if (difficulty.equals("Easy")){
                South.put("Brazil" , "Brasilia");
                South.put("Argentina" , "Buenos Aires");
                South.put("Chile" , "Santiago");
                South.put("Peru" , "Lima");
                South.put("Colombia" , "Bogota");
                South.put("Bolivia" , "Sucre");

            }
            else {

                South.put("Ecuador" , "Quito");
                South.put("Paraguay" , "Asuncion");
                South.put("Suriname" , "Paramaribo");
                South.put("Uruguay" , "Montevideo");
                South.put("Vanezuela" , "Caracas");
                South.put("Guyana" , "GeorgeTown");
            }

        }






    }

    public HashMap<String,String> getSouth(String mode){

        if (mode.equals("Capital")) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : South.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            South.clear();
            South.putAll(newMap);
            newMap.clear();
        }
        else {
        }

        return South;
    }

    ///////////////////////////////////////////////    AFRİCA    /////////////////////////////////////////////////

    public void setAfrica(String difficulty , String lang){


        if (lang.equals("Avrupa")){
            if (difficulty.equals("Easy")) {

                Africa.put ("Mısır", "Kahire");
                Africa.put ("Cezayir", "Cezayir");
                Africa.put ("Kenya", "Nairobi");
                Africa.put ("Libya", "Trablus");
                Africa.put ("Kamerun", "Yaoundé");
                Africa.put ("Etiyopya", "Addis Ababa");
                Africa.put ("Orta Afrika Cumhuriyeti", "Bangui");
                Africa.put ("Çad", "N'Djamena");
                Africa.put ("Fas", "Rabat");
                Africa.put ("Nijerya", "Abuja");
                Africa.put ("Somali", "Mogadişu");
                Africa.put ("Güney Afrika", "Cape Town");
                Africa.put ("Sudan", "Hartum");
                Africa.put ("Tunus", "Tunus");
                Africa.put ("Senegal", "Dakar");

            }
            else{
                Africa.put ("Gana", "Akra");
                Africa.put ("Mauritius", "Port Louis");
                Africa.put ("Angola", "Luanda");
                Africa.put ("Benin", "Porto-Novo");
                Africa.put ("Burkina Faso", "Ouagadougou");
                Africa.put ("Yeşil Burun Adaları", "Praia");
                Africa.put ("Komorlar", "Moroni");
                Africa.put ("Kongo-Brazzaville", "Brazzaville");
                Africa.put ("Kongo-Kinşasa", "Kinşasa");
                Africa.put ("Fildişi Sahili", "Yamoussoukro");
                Africa.put ("Cibuti", "Cibuti Şehri");
                Africa.put ("Ekvator Ginesi", "Malabo");
                Africa.put ("Eritre", "Asmara");
                Africa.put ("Gabon", "Libreville");
                Africa.put ("Gambiya", "Banjul");
                Africa.put ("Gine", "Conakry");
                Africa.put ("Gine-Bissau", "Bissau");
                Africa.put ("Lesotho", "Maseru");
                Africa.put ("Liberya", "Monrovia");
                Africa.put ("Madagaskar", "Antananarivo");
                Africa.put ("Malavi", "Lilongwe");
                Africa.put ("Mali", "Bamako");
                Africa.put ("Moritanya", "Nouakchott");
                Africa.put ("Mozambik", "Maputo");
                Africa.put ("Namibya", "Windhoek");
                Africa.put ("Nijer", "Niamey");
                Africa.put ("Yeniden Birleşme", "Saint-Denis");
                Africa.put ("Ruanda", "Kigali");
                Africa.put ("Sao Tome ve Principe", "São Tomé");
                Africa.put ("Seyşeller", "Victoria");
                Africa.put ("Sierra Leone", "Freetown");
                Africa.put ("Svaziland", "Mbabane");
                Africa.put ("Tanzanya", "Darüsselam");
                Africa.put ("Togo", "Lomé");
                Africa.put ("Uganda", "Kampala");
                Africa.put ("Zambiya", "Lusaka");
                Africa.put ("Zimbabve", "Harare");
            }

        }




        else {

            if (difficulty.equals("Easy")) {
                Africa.put("Egypt" , "Cairo");
                Africa.put("Algeria" , "Agiers");
                Africa.put("Kenya" , "Nairobi");
                Africa.put("Libya" , "Tripoli");
                Africa.put("Cameroon" , "Yaoundé");
                Africa.put("Ethiopia" , "Addis Ababa");
                Africa.put("Central African Republic" , "Bangui");
                Africa.put("Chad" , "N'Djamena");
                Africa.put("Morocco" , "Rabat");
                Africa.put("Nigeria" , "Abuja");
                Africa.put("Somalia" , "Mogadishu");
                Africa.put("South Africa" , "Cape Town");
                Africa.put("Sudan" , "Khartoum");
                Africa.put("Tunisia" , "Tunis");
                Africa.put("Senegal" , "Dakar");

            }
            else{

                Africa.put("Ghana" , "Accra");
                Africa.put("Mauritius" , "Port Louis");
                Africa.put("Angola" , "Luanda");
                Africa.put("Benin" , "Porto-Novo");
                Africa.put("Burkina Faso" , "Ouagadougou");
                Africa.put("Cape Verde" , "Praia");
                Africa.put("Comoros" , "Moroni");
                Africa.put("Congo-Brazzaville" , "Brazzaville");
                Africa.put("Congo-Kinshasa" , "Kinshasa");
                Africa.put("Cote d'Ivoire" , "Yamoussoukro");
                Africa.put("Djibouti" , "Djibouti City");
                Africa.put("Equatorial Guinea" , "Malabo");
                Africa.put("Eritrea" , "Asmara");
                Africa.put("Gabon" , "Libreville");
                Africa.put("Gambia" , "Banjul");
                Africa.put("Guinea" , "Conakry");
                Africa.put("Guinea-Bissau" , "Bissau");
                Africa.put("Lesotho" , "Maseru");
                Africa.put("Liberia" , "Monrovia");
                Africa.put("Madagascar" , "Antananarivo");
                Africa.put("Malawi" , "Lilongwe");
                Africa.put("Mali" , "Bamako");
                Africa.put("Mauritania" , "Nouakchott");
                Africa.put("Mozambique" , "Maputo");
                Africa.put("Namibia" , "Windhoek");
                Africa.put("Niger" , "Niamey");
                Africa.put("Reunion" , "Saint-Denis");
                Africa.put("Rwanda" , "Kigali");
                Africa.put("Sao Tome and Principe" , "São Tomé");
                Africa.put("Seychelles" , "Victoria");
                Africa.put("Sierra Leone" , "Freetown");
                Africa.put("Swaziland" , "Mbabane");
                Africa.put("Tanzania" , "Dar es Salaam");
                Africa.put("Togo" , "Lomé");
                Africa.put("Uganda" , "Kampala");
                Africa.put("Zambia" , "Lusaka");
                Africa.put("Zimbabwe" , "Harare");
            }

        }



    }

    public HashMap<String,String> getAfrica(String mode){

        if (mode.equals("Capital")) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : Africa.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            Africa.clear();
            Africa.putAll(newMap);
            newMap.clear();
        }
        else {
        }

        return Africa;
    }

    ///////////////////////////////////////////////    All    /////////////////////////////////////////////////

    public void setAll(String difficulty , String lang){

        setNorth(difficulty , lang);
        setSouth(difficulty , lang);
        setAfrica(difficulty , lang);
        setAsia(difficulty,lang);
        setEurope(difficulty,lang);
        All.putAll(getAsia("mode1"));
        All.putAll(getEurope("mode1"));
        All.putAll(getAfrica("mode1"));
        All.putAll(getNorth("mode1"));
        All.putAll(getSouth("mode1"));

    }

    public HashMap<String,String> getAll(String mode){

        if (mode.equals("Capital")) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : All.entrySet()) {
                newMap.put(entry.getValue(), entry.getKey());
            }
            All.clear();
            All.putAll(newMap);
            newMap.clear();
        }
        else {
        }

        return All;
    }


}