package Color_yr.ALLMusic.MusicAPI;

import Color_yr.ALLMusic.MusicAPI.SongSearch.SearchPage;
import Color_yr.ALLMusic.MusicAPI.SongInfo.SongInfo;
import Color_yr.ALLMusic.MusicAPI.SongLyric.LyricDo;

public interface IMusic {
    SongInfo GetMusic(String ID, String player, boolean isList);

    String GetPlayUrl(String ID);

    void SetList(String ID);

    LyricDo getLyric(String ID);

    SearchPage Search(String[] name);

    String GetListMusic();
}
