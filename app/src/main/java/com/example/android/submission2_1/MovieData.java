package com.example.android.submission2_1;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"Fast & Furious Presents: Hobbs & Shaw", "2h 16m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/keym7MPn1icW1wWfzMnW3HeuzWU.jpg", "66", "A spinoff of The Fate of the Furious, focusing on Johnson's US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Statham's Deckard Shaw."},
            {"The Lion King", "1h 58m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dzBtMocZuJbjLOXvrl4zGYigDzh.jpg", "72", "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cub's arrival. Scar, Mufasa's brother—and former heir to the throne—has plans of his own. The battle for Pride Rock is ravaged with betrayal, tragedy and drama, ultimately resulting in Simba's exile. With help from a curious pair of newfound friends, Simba will have to figure out how to grow up and take back what is rightfully his."},
            {"Detective Conan: The Fist of Blue Sapphire", "-", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/86Y6qM8zTn3PFVfCm9J98Ph7JEB.jpg", "49", "23rd movie in the \"Detective Conan\" franchise."},
            {"Avengers: Endgame", "3h 1m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg", "84", "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store."},
            {"Descendants 3", "1h 46m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7G7xaUXyvEC8Q4R9ljZFN2Bu1Xf.jpg", "90", "The teenagers of Disney's most infamous villains return to the Isle of the Lost to recruit a new batch of villainous offspring to join them at Auradon Prep."},
            {"Spider-Man: Far from Home", "2h 9m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg", "78", "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent."},
            {"Kamen Rider Zi-O the Movie: Over Quartzer!", "-", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ftVSHLDbkVh0XycxGPqszEUyt3T.jpg", "65", "The Quartzers, calling themselves the Wardens of Time, appear after Sougo Tokiwa has collected all of the Heisei Era Ride Watches. A grand conspiracy behind the birth of the King of Time becomes ever clearer."},
            {"Alita: Battle Angel", "2h 2m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg", "68", "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."},
            {"Captain Marvel", "2h 4m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg", "70", "The story follows Carol Danvers as she becomes one of the universe’s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe."},
            {"Toy Story 4", "1h 40m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg", "77", "Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy."},
            {"Once Upon a Time in Hollywood", "2h 41m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/8j58iEBw9pOXFD2L0nt0ZXeHviB.jpg", "76", "A faded television actor and his stunt double strive to achieve fame and success in the film industry during the final years of Hollywood's Golden Age in 1969 Los Angeles."},
            {"John Wick: Chapter 3 – Parabellum", "2h 11m", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg", "71", "Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn."},

    };
    public static ArrayList<Movie> getListData(){
        Movie movie = null;
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            movie = new Movie();
            movie.setName(aData[0]);
            movie.setDuration(aData[1]);
            movie.setPhoto(aData[2]);
            movie.setRating(aData[3]);
            movie.setDesc(aData[4]);
            list.add(movie);
        }
        return list;
    }
}
