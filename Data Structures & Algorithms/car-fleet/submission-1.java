class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    // TreeMap trié par position décroissante (plus proche du target en premier)
    TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < position.length; i++) {
        treeMap.put(position[i], speed[i]);
    }

    int fleets = 0;
    double lastTimeToReach = -1.0;

    for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
        int pos = entry.getKey();
        int s = entry.getValue();
        
        // Calcul du temps : (Distance restante) / Vitesse
        double currentTimeToReach = (double) (target - pos) / s;

        // Si la voiture actuelle met PLUS de temps que la flotte devant elle,
        // elle ne pourra jamais la rattraper. Elle devient le leader d'une nouvelle flotte.
        if (currentTimeToReach > lastTimeToReach) {
            fleets++;
            lastTimeToReach = currentTimeToReach;
        }
        // Sinon (currentTimeToReach <= lastTimeToReach), elle rattrape la flotte 
        // et "fusionne" dedans, donc on ne fait rien.
    }

    return fleets;
}
}
