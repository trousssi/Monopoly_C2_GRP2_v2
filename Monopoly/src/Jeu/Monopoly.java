package Jeu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Monopoly {
    private HashMap<Integer, Carreau> carreaux = new HashMap<>();
    private HashMap<String, Groupe> groupes = new HashMap<>();
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void CreerPlateau(String dataFilename) {
        buildGamePlateau(dataFilename);
    }

    public Carreau AvancerJoueur(Joueur joueur, int sommeDes) {
        Carreau carreau = joueur.getPositionCourante();
        int numCar = carreau.getNumero();
        carreau = this.getCarreau(numCar+sommeDes);
        joueur.setPositionCourante(carreau);
        return carreau;
    }

    public void afficherEtatJoueurs() {
        throw new UnsupportedOperationException();
    }

    public Carreau getCarreau(int numCarreau) {
        numCarreau = numCarreau % 40;
        if (numCarreau == 0) {
            numCarreau = 40;
        }
        Carreau car = this.carreaux.get(numCarreau);
        return car;
    }

    public void addJoueur (Joueur joueur) {
        joueurs.add(joueur);
    }

    private void buildGamePlateau(String dataFilename)
    {
        Groupe bleuFonce = new Groupe(CouleurPropriete.bleuFonce);
        groupes.put(CouleurPropriete.bleuFonce.toString(), bleuFonce);
        Groupe orange = new Groupe(CouleurPropriete.orange);
        groupes.put(CouleurPropriete.orange.toString(), orange);
        Groupe mauve = new Groupe(CouleurPropriete.mauve);
        groupes.put(CouleurPropriete.mauve.toString(), mauve);
        Groupe violet = new Groupe(CouleurPropriete.violet);
        groupes.put(CouleurPropriete.violet.toString(), violet);
        Groupe bleuCiel = new Groupe(CouleurPropriete.bleuCiel);
        groupes.put(CouleurPropriete.bleuCiel.toString(), bleuCiel);
        Groupe jaune = new Groupe(CouleurPropriete.jaune);
        groupes.put(CouleurPropriete.jaune.toString(), jaune);
        Groupe vert = new Groupe(CouleurPropriete.vert);
        groupes.put(CouleurPropriete.vert.toString(), vert);
        Groupe rouge = new Groupe(CouleurPropriete.rouge);
        groupes.put(CouleurPropriete.rouge.toString(), rouge);

        try{
            ArrayList<String[]> data = readDataFile(dataFilename, ",");

            //TODO: create cases instead of displaying
            for(int i=0; i<data.size(); ++i){
                String caseType = data.get(i)[0];
                if(caseType.compareTo("P") == 0){
                        System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                        ProprieteAConstruire prop = new ProprieteAConstruire(Integer.parseInt(data.get(i)[1]), data.get(i)[2], Integer.parseInt(data.get(i)[4]), Integer.parseInt(data.get(i)[5]), null, groupes.get(data.get(i)[3]));
                        carreaux.put(Integer.parseInt(data.get(i)[1]), prop);
                        groupes.get(data.get(i)[3]).addPropriete(prop);

                }
                else if(caseType.compareTo("G") == 0){
                        System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                        Gare gare = new Gare(Integer.parseInt(data.get(i)[1]), data.get(i)[2], Integer.parseInt(data.get(i)[4]), Integer.parseInt(data.get(i)[5]), null);
                        carreaux.put(Integer.parseInt(data.get(i)[1]), gare);
                }
                else if(caseType.compareTo("C") == 0){
                        System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                        Compagnie compagnie = new Compagnie(Integer.parseInt(data.get(i)[1]), data.get(i)[2], Integer.parseInt(data.get(i)[4]), Integer.parseInt(data.get(i)[5]), null);
                        carreaux.put(Integer.parseInt(data.get(i)[1]), compagnie);
                }
                else if(caseType.compareTo("AU") == 0){
                        System.out.println("Case Autre :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                        AutreCarreau autreCarr = new AutreCarreau(Integer.parseInt(data.get(i)[1]), data.get(i)[2]);
                        carreaux.put(Integer.parseInt(data.get(i)[1]), autreCarr);
                }
                else {
                        System.err.println("[buildGamePleateau()] : Invalid Data type");
                }

            }

        } 
        catch(FileNotFoundException e){
            System.err.println("[buildGamePlateau()] : File is not found!");
        }
        catch(IOException e){
            System.err.println("[buildGamePlateau()] : Error while reading file!");
        }
    }

    private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException
    {
        ArrayList<String[]> data = new ArrayList<String[]>();

        BufferedReader reader  = new BufferedReader(new FileReader(filename));
        String line = null;
        while((line = reader.readLine()) != null){
                data.add(line.split(token));
        }
        reader.close();

        return data;
    }
}
