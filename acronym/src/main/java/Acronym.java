class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        final String phrase = this.phrase.toUpperCase();

        if(phrase.isBlank()){
            return "";
        }

        StringBuilder acronymBuilder = new StringBuilder();
        acronymBuilder.append(phrase.charAt(0));

        int index = 1;
        while (index < (phrase.length() - 1)){
            if(phrase.charAt(index) == ' ' || phrase.charAt(index) == '-' ){
                while(index < phrase.length()){
                    if(phrase.charAt(index + 1) == ' ' || phrase.charAt(index + 1) == '_' || phrase.charAt(index + 1) == '-'){
                        index++;
                    }else{
                        break;
                    }
                }
                acronymBuilder.append(phrase.charAt(index+1));
            }
            index++;
        }

        return  acronymBuilder.toString();
    }
}
