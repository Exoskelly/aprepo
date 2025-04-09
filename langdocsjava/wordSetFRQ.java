public static int countA(WordSet s) {
    int count = 0;
    for (int i = 1; i <= s.size(); i++) {
        if (s.findkth(i).startsWith("A")) {
            count++;
        }
    }
    return count;
} public static void removeA(WordSet s) {
    int n = s.size();
    for (int i = 1; i <= n; i++) {
        String word = s.findkth(i);
        if (word.startsWith("A")) {
            s.remove(word);
            i--;
            n--;
        }
    }
} public static WordSet commonElements(WordSet s1, WordSet s2) {
    WordSet result = new WordSet();
    for (int i = 1; i <= s1.size(); i++) {
        String word = s1.findkth(i);
        if (s2.contains(word)) {
            result.insert(word);
        }
    }
    return result;
}
