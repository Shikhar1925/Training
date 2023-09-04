package projectalbum;

import java.util.Scanner;

public class AlbumMenu {
	private static AlbumDaoImplementation dao;

	static {
		dao = new AlbumDaoImplementation();
	}

	public static void main(String[] args) throws Exception {

		Scanner console = new Scanner(System.in);

		while (true) {

			System.out.println("Main Menu");
			System.out.println(
					"1-add music\n2-Find By Artist\n3-Find By Genre\n4-List of Music\n5-find by title\n6-update\n7-delete\n8-exit");
			System.out.println("Enter Choice: ");
			int choice = console.nextInt();
			switch (choice) {
			case 1:
				addMusic();
				break;
			case 2:
				findArt();
				break;
			case 3:
				findGenre();
				break;
			case 4:
				listMusic();
				break;
			case 5:
				findTitle();
				break;
			case 6:
				update();
				break;
			case 7:
				delete();
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Invalid option");
			}
		}
	}

	private static void listMusic() {

		dao.list().forEach(System.out::println);
	}

	private static void findArt() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Song artist: ");
		String art = console.next();
		System.out.println(dao.findByArtist(art));
	}

	private static void findTitle() throws InvalidAlbumException {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Song title: ");
		String art = console.next();
		System.out.println(dao.findByTitle(art));
	}

	private static void findGenre() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Song genre: ");
		String gen = console.next();
		System.out.println(dao.findByGenre(gen));
	}

	private static void addMusic() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Title: ");
		String title = console.next();
		System.out.println("Enter Artist Name: ");
		String art = console.next();
		System.out.println("Enter Genre: ");
		String gen = console.next();
		Album p = new Album(title, art, gen);
		dao.persist(p);
	}

	private static void update() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Album details to update: ");

		String update = console.next();
		String update1 = console.next();
		String update2 = console.next();

		Album a = new Album(update, update1, update2);
		System.out.println(dao.update(a));

	}

	private static void delete() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Album's Title to delete: ");

		String delete = console.next();

		try {
			System.out.println(dao.delete(delete));
		} catch (InvalidAlbumException e) {
			e.printStackTrace();
		}

	}

}
