class Proverb {

    private final String[] words;

    Proverb(String[] words) {

        this.words = words;
    }

    String recite() {

        final String formatA = "For want of a %s the %s was lost.";
        final String formatB = "And all for the want of a %s.";

        StringBuilder stringBuilder = new StringBuilder();

        if(this.words.length > 0){
            int index = 0;
            while (index < this.words.length - 1){
                stringBuilder.append(String.format(formatA, this.words[index], this.words[index+1]));
                stringBuilder.append('\n');

                index++;
            }

            stringBuilder.append(String.format(formatB, this.words[0]));
        }

        return stringBuilder.toString();
    }
}
