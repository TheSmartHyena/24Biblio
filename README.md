Partie 1: setup
Les classes de base, Bibliothèque, Livre, Client, Auteur. 
Gérer via des collections, la liste des Livres, Clients, Auteurs et emprunts.
Utiliser uniquement des identifiants pour les manipulations comme sur l’emprunt.
void emprunter(int id_livre, int id_emprunteur)
Gérer les mauvais input: id non existant, déjà emprunté … simplement en affichant un message dans la console.
Fonction: emprunt/retour sur la classe Bibliothèque.

Partie 2: singleton
Avoir des identifiants auto-générés dans nos instances de livres … Via un Singleton. 
Dans le constructeur, ne pas envoyer l’id, mais faire que lors de l’instanciation, on va chercher un id via ce singleton de génération de id; 

Partie 3: Médiathèque (12/01/2024)
La bibliothèque se transforme en médiathèque:
Classe abstraite media, avec une interface
Livre, CD, DVD sont et hérite du media. 
Livre: nbPage
CD: duree, typeMusique
DVD: duree, typeFilm
Une Collection unique pour tout. 

Partie 4: Factory (12/01/2024)
Unifier l’instanciation des classes via une factory
