class Anagram{
	public static void main(String[] args){
		String[] words = { "television", "computer", "mouse", "phone" };
        
        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
            /*
            (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
            char�迭 question�� ��� ������ ��ġ�� ���Ƿ� �ٲ۴�.
            */
            for(int j = 0; j < question.length; j++){
                int k = (int)(Math.random()*question.length);
                
                char temp = question[j];
                question[j] = question[k];
                question[k] = temp;
            }
                
            System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i+1, new String(question));

            String answer = words[i];
            // trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
            if(words[i].equals(answer.trim()))
                System.out.printf("�¾ҽ��ϴ�.%n%n");
            else
                System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
        }
	}
}