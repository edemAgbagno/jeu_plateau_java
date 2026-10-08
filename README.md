# 🎲 Jeu de plateau mathématique en Java

Jeu de déduction multijoueur en console, écrit en **Java orienté objet**. Le plateau est composé de cases cachées contenant chacune un nombre et un opérateur mathématique. À chaque tour, un joueur choisit deux cases, reçoit des indices calculés à partir de leurs valeurs, et tente de deviner les nombres cachés pour marquer des points.

## 🕹️ Règles du jeu

1. On saisit le nom des joueurs (autant que souhaité).
2. On choisit la **valeur maximale** des cases. Le plateau fait alors `√max` lignes sur `√max + 1` colonnes.
3. Chaque case reçoit au hasard une **valeur** entre 1 et le maximum, et un **opérateur** parmi `+`, `-`, `*` et `:` (division).
4. À son tour, le joueur choisit **deux cases** (ligne et colonne).
5. Le jeu affiche un **indice** pour chaque case : l'opérateur de la case appliqué aux deux valeurs.
   *Exemple : si la case 1 vaut 6 avec l'opérateur `*` et la case 2 vaut 3, l'indice de la case 1 est 6 × 3 = 18.*
6. Le joueur peut proposer une **hypothèse** sur les deux valeurs :
   - si les deux sont justes, les cases sont révélées sur le plateau et le joueur marque la somme des deux valeurs ;
   - sinon, le tour passe.
7. La partie se termine quand toutes les cases ont été découvertes.

### Exemple d'affichage

```
Valeur maximale des cases :
16
## ## ## ## ##
## ## ## ## ##
## ## ## ## ##
## ## ## ## ##
Joueur Alice. Score:0. Joue
```

## 🏗️ Architecture

```
jeu/
├── Jeu.java              Point d'entrée (main)
├── partie.java           Déroulement de la partie : joueurs, plateau, tours
├── PlateauJeu.java       Grille de cases, affichage, test de fin de partie
├── Case.java             Valeur aléatoire, indice et état « trouvée »
├── TourJoueur.java       Choix des cases, calcul des indices, hypothèses
├── Joueur.java           Nom et score d'un joueur
├── LesJoueurs.java       Liste des joueurs
├── Indice.java           Classe abstraite d'un opérateur
├── IndAddition.java      ┐
├── IndSoustraction.java  │ Sous-classes concrètes d'Indice
├── IndMultiplie.java     │
├── IndDivision.java      ┘
├── LesIndices.java       Liste des opérateurs disponibles
└── Lire.java             Utilitaire de saisie au clavier
```

Notions de programmation orientée objet mises en œuvre :
- **héritage et abstraction** avec la classe abstraite `Indice` et ses quatre sous-classes ;
- **encapsulation** avec attributs privés et accesseurs ;
- **composition** : une partie contient des joueurs et un plateau, un plateau contient des cases, une case contient un indice.

## 🚀 Lancer le jeu

Prérequis : **JDK 8 ou plus récent**.

```bash
git clone https://github.com/edemAgbagno/jeu_plateau_java.git
cd jeu_plateau_java
javac jeu/*.java
java jeu.Jeu
```

Le projet peut aussi être ouvert directement dans **NetBeans**, **IntelliJ IDEA** ou **Eclipse**.

## 🧭 Limites connues et pistes d'amélioration

- La boucle principale (`partie.java`) utilise `while (plateau.termine())` au lieu de `while (!plateau.termine())` : la partie s'arrête après le premier tour.
- Le score est **remplacé** au lieu d'être **additionné** quand un joueur trouve une paire.
- Les saisies ne sont pas vérifiées : une case hors du plateau provoque une erreur.
- La division est entière (`7 : 2 = 3`).
- Pistes : interface graphique (Swing ou JavaFX), tests unitaires avec JUnit, niveaux de difficulté.

## 👤 Auteur

**Edem Agbagno** — [github.com/edemAgbagno](https://github.com/edemAgbagno)
