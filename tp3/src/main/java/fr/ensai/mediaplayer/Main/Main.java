package fr.ensai.mediaplayer.Main;

import java.util.List;
import fr.ensai.mediaplayer.MusicalGenre;

import fr.ensai.mediaplayer.Artist;
import fr.ensai.mediaplayer.Song;

public class Main {
    public static void main(String[] args) {
        String lyrics = """
                Une rivière coule en bas dans la vallée,
                Comme une petite rivière qui se laisserait aller,
                Peu à peu envasée, assagie,
                Asphyxiée, ralentie,
                Les embâcles ont cassé le courant,
                Et le sable s′est déposé insensiblement,
                Les mousses ont envahi les pierres,
                Petit à petit la rivière
                S'est couchée dans son lit.
                Une rivière coule en bas dans la vallée,
                Comme une petite rivière qui se laisserait aller,

                à l′abandon au gré de la nonchalance,
                Des saisons polluées par négligence,
                Publicité
                Sur cette terre cultivée en cadence,
                Ou industrialisée sans prudence,
                Les poissons s'en vont,
                Quand ça sent le poison,
                Sous les draps de la pluie,
                La rivière s'est couchée dans son lit.
                Une rivière coule en bas dans la vallée,
                Comme une petite rivière qui se laisserait aller,
                Peu à peu l′eau se brouille avec l′homme,
                Quand l'homme la souille comme,
                Ces ferrailles qui rouillent, ces déchets, ces gravats,
                Ces arbres morts et ces branches en tas,
                Ou ces vieux ressorts de matelas,
                Qui salissent le lit de cette rivière là.
                Une rivière coule en bas dans la vallée,
                Comme une petite rivière qui se laisserait aller,
                Publicité
                Y a plus de haies, les berges s′éboulent,
                Mais c'est le monde entier qui s′écroule,
                Quand la faune et la flore,
                Disparaissent du décor,
                Comme ici mais tout n'est pas fini,
                Peut être qu′il faut prendre parti,
                Pour que la poésie réveille une rivière qui se couche dans son lit.
                """;
        Artist Charlelie = new Artist("Charlélie", "Couture", "French");
        Song readedsong = new Song("La rivière", Charlelie, 2025, 3, lyrics, Charlelie, Charlelie, List.of(MusicalGenre.POP));

        readedsong.play();
    }

}
