package projectalbum;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumDaoImplementation implements AlbumDao {
	
private List<Album> albums;

  
    public AlbumDaoImplementation() {

        try
        {
            Stream<String> lines=Files.lines(Paths.get("src/album.txt"));
            albums=lines.map(line->{
                String[] record=line.split(",");
                return new Album(record[0],record[1],record[2]);
            }).collect(Collectors.toList());
        }catch(IOException e){
            e.printStackTrace();
        }        

    }

	@Override
	public void persist(Album a) {
		albums.add(a);
	}

	@Override
	public List<Album> findByTitle(String title) throws InvalidAlbumException {
		return albums.stream().filter(p -> p.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
	}

	@Override
	public List<Album> list() {
		return albums;
	}

	@Override
	public List<Album> findByArtist(String Artist) {
		return albums.stream().filter(p -> p.getArtist().equalsIgnoreCase(Artist)).collect(Collectors.toList());
	}

	@Override
	public List<Album> findByGenre(String Genre) {
		return albums.stream().filter(p -> p.getGenre().equalsIgnoreCase(Genre)).collect(Collectors.toList());
	}

	@Override
	public boolean update(Album a) {
		if (albums.add(a)) {
			albums.add(a);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		return albums.removeIf(p -> p.getTitle().equalsIgnoreCase(title)) ? true : false;
	}

}
