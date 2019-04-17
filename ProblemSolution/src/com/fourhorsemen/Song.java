package com.fourhorsemen;

/*
 * A playlist is considered a repeating playlist if any of the songs contain a reference to a
 * previous song in the playlist. Otherwise, the playlist will end with the last song which 
 * points to null.
 * Implement a function isRepeatingPlaylist that, efficiently with respect to time used,
 * returns true if a playlist is repeating or false if it is not.
 */

public class Song {

	private String name;
	private Song nextSong;
	private static boolean isRepeatingPlaylist = false;

	public Song(String name) {
		this.name = name;
	}

	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}

	public Song getNextSong() {
		return this.nextSong;
	}

	public boolean isRepeatingPlaylist() {

		Song tmp = this.getNextSong();

		try {
			if(tmp.toString().equals("Hello")) {
				isRepeatingPlaylist=true;
			}
			else {
				tmp.isRepeatingPlaylist();
			}

		} catch (Exception e) {
			System.out.println(tmp.toString() + " song is not linked to any song in the playlist");
		}


		finally {
			return isRepeatingPlaylist;
		}


	}

	@Override
	public String toString() {
		return  this.name;
	}

	public static void main(String[] args) {
		Song first = new Song("Hello");
		Song second = new Song("Eye of the tiger");
		Song third = new Song("Starboy");

		first.setNextSong(second);
		second.setNextSong(third);
		third.setNextSong(first);

		System.out.println(first.isRepeatingPlaylist());
	}

}
