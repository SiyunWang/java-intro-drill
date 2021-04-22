import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Playlist {
    public String name;
    public ArrayList<Song> list = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void addSong(Song newSong) {
        list.add(newSong);
    }

    public String[] songNames() {
        ArrayList<String> namesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            namesList.add(song.title);
        }
        String[] nameStrings = namesList.toArray(new String[namesList.size()]);
        return nameStrings;
    }

    public int totalDuration() {
        int duration = 0;
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            duration += song.durationInSeconds;
        }
        return duration;
    }

    public void swap(Song song1, Song song2) {
        int index1 = list.indexOf(song1);
        int index2 = list.indexOf(song2);
        Collections.swap(list, index1, index2);
    }

    public void removeSong(Song songToRemove) {
        int removeIndex = list.indexOf(songToRemove);
        list.remove(removeIndex);
    }
}
