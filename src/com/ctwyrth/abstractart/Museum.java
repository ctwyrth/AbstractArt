package com.ctwyrth.abstractart;
import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art>();
		
		// CREATE INSTANCES & FILL DATA
		Painting monaLisa = new Painting("Oils - Realism - Renaissance");
		Painting lesDem = new Painting("Oils - Cubism - Modern");
		Painting laTour = new Painting("Oils - Pointilism - Barogue");
		
		Sculpture nefertiti = new Sculpture("Stucco-coated Limestone - 1345 BC");
		Sculpture terraArmy = new Sculpture("Clay - 210 BC");
		
		monaLisa.setTitle("Mona Lisa - Gioconda");
		monaLisa.setAuthor("Leonardo da Vinci");
		monaLisa.setDescription("The Mona Lisa is a half-length portrait painting by Italian artist Leonardo da Vinci. Considered an archetypal masterpiece of the Italian Renaissance, it has been described as \"the best known, the most visited, the most written about, the most sung about, the most parodied work of art in the world\".");
		
		lesDem.setTitle("Les Demoiselles d'Avignon");
		lesDem.setAuthor("Pablo Picasso");
		lesDem.setDescription("This work titled Les Demoiselles d’Avignon is among the most recognizable paintings in the cubism style and was originally known as The Brothel of Avignon. However, the striking image of five naked women was not likely to be well received in 1907 Spain, prompting him to slightly alter its name to a more appropriate option.");
		
		laTour.setTitle("La Tour Eiffel");
		laTour.setAuthor("Georges-Pierre Seurat");
		laTour.setDescription("\"La Tour Eiffel\" (1889) is a painting by French artist Georges-Pierre Seurat.");
		
		nefertiti.setTitle("Bust of Nefertiti");
		nefertiti.setAuthor("unknown");
		nefertiti.setDescription("This portrait has been a symbol of feminine beauty since it was first unearthed in 1912 within the ruins of Amarna, the capital city built by the most controversial Pharaoh of Ancient Egyptian history: Akhenaten.");
		
		terraArmy.setTitle("The Terracotta Army");
		terraArmy.setAuthor("unknown");
		terraArmy.setDescription("Discovered in 1974, the Terracotta Army is an enormous cache of clay statues buried in three massive pits near the tomb of Shi Huang, the first Emperor of China, who died in 210 BC.");
		
		museum.add(monaLisa);
		museum.add(lesDem);
		museum.add(laTour);
		museum.add(nefertiti);
		museum.add(terraArmy);
		
		for (int i = 0; i < museum.size(); i++) {
			museum.get(i).viewArt();
			System.out.println("\n");
		}
		
//		System.out.println("---------------- PAINTINGS ----------------");
//		System.out.println("\n");
//		monaLisa.viewArt();
//		System.out.println("\n");
//		lesDem.viewArt();
//		System.out.println("\n");
//		laTour.viewArt();
//		System.out.println("\n");
//		System.out.println("---------------- SCULPTURES ----------------");
//		System.out.println("\n");
//		nefertiti.viewArt();
//		System.out.println("\n");
//		terraArmy.viewArt();
//		System.out.println("\n");
	}
}
