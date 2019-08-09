package com.example.android.submission2_1;

import java.util.ArrayList;

public class TVShowData {
    public static String[][] data = new String[][]{
            {"The Boys", "60m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dzOxNbbz1liFzHU1IPvdgUR647b.jpg", "86", "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty."},
            {"Doom Patrol", "60m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg", "62", "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."},
            {"Pandora", "42m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/tPsvhL45f1AjES5rycFIxnbaH8v.jpg", "52", "In the year 2199, a young woman who has lost everything finds a new life at Earth's Space Training Academy where she learns to defend the galaxy from intergalactic threats."},
            {"Dr.Stone", "24m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dLlnzbDCblBXcJqFLXyvN43NIwp.jpg", "66", "The science-fiction adventure follows two boys struggle to revive humanity after a mysterious crisis has left everyone in the world turned to stone for several millennia."},
            {"Arifureta: From Commonplace to World's Strongest", "24m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/cmMh8awgtRvLUKmYvIXtVCYINIv.jpg", "52", "Seventeen-year-old Hajime Nagumo is your average, everyday otaku. However, his simple life of pulling all-nighters and sleeping in school is suddenly turned upside down when he, along with the rest of his class, is summoned to a fantasy world! They're treated like heroes and tasked with the duty of saving the human race from utter extinction. But what should have been any otaku's wet dream quickly turns into Hajime's nightmare. While the rest of his class are blessed with godlike powers, Hajime's job, Synergist, only has a single transmutation skill. Ridiculed and bullied by his classmates for being weak, he soon finds himself in despair. Will he be able to survive in this dangerous world of monsters and demons with only a glorified blacksmith's level of strength?"},
            {"Euphoria", "53m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5mi3aRl16yKmfpQJMzvqN5TXkdA.jpg", "75", "A group of high school students navigate love and friendships in a world of drugs, sex, trauma, and social media."},
            {"Pennyworth", "60m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/czVjj5W113Aggz8fmtiW5bY1Vsz.jpg", "83", "The origin story of Bruce Wayne’s legendary butler, Alfred Pennyworth, a former British SAS soldier who forms a security company and goes to work with Thomas Wayne, Bruce’s billionaire father, in 1960s London."},
            {"Fire Force", "24m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xwKGTFXL2kKz6P0WI23Q2ecaGOO.jpg", "64", "Year 198 of the Solar Era in Tokyo, special fire brigades are fighting against a phenomenon called spontaneous human combustion where humans beings are turned into living infernos called \"Infernals\". While the Infernals are first generation cases of spontaneous human combustion, later generations possess the ability to manipulate flames while retaining human form. Shinra Kusakabe, a youth who gained the nickname Devil's Footprints for his ability to ignite his feet at will, joins the Special Fire Force Company 8 which composes of other flames users as they work to extinguish any Infernals they encounter. As a faction that is creating Infernals appears, Shira begins to uncover the truth behind a mysterious fire that caused the death of his family twelve years ago."},
            {"Another Life", "45m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/htazQ0cPoloL5SJ2bqOCKh9UTcc.jpg", "63", "After a massive alien artifact lands on Earth, Niko Breckinridge leads an interstellar mission to track down its source and make first contact."},
            {"Chernobyl", "70m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg", "85", "A dramatization of the true story of one of the worst man-made catastrophes in history, the catastrophic nuclear accident at Chernobyl. A tale of the brave men and women who sacrificed to save Europe from unimaginable disaster."},
            {"Swamp Thing", "60m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dD3HcMczLC9wNvfNzx4pZVyl6q8.jpg", "67", "CDC researcher Abby Arcane investigates what seems to be a deadly swamp-born virus in a small town in Louisiana but she soon discovers that the swamp holds mystical and terrifying secrets. When unexplainable and chilling horrors emerge from the murky marsh, no one is safe."},
            {"Good Omens", "60m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/hzEzugrfagYisxQXemGEuI4zcQA.jpg", "81", "Aziraphale, an angel, and Crowley, a demon, join forces to find the Antichrist and stop Armageddon."},

    };

    public static ArrayList<TvShow> getListData(){
        ArrayList<TvShow> list = new ArrayList<>();
        for (String[] aData : data) {
            TvShow tvshow = new TvShow();
            tvshow.setName(aData[0]);
            tvshow.setDuration(aData[1]);
            tvshow.setPhoto(aData[2]);
            tvshow.setRating(aData[3]);
            tvshow.setDesc(aData[4]);
            list.add(tvshow);
        }
        return list;
    }
}