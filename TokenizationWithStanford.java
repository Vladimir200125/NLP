import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class TokenizationWithStanford {
	    public static void main(String[] args) {
		            usingTheStanfordTokenizer();
			        }

	        private static void usingTheStanfordTokenizer() {
			        String paragraph = "Let's pause, and then reflect.";
				        Properties props = new Properties();
					        props.put("annotators", "tokenize");
						        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
							        
							        Annotation document = new Annotation(paragraph);
								        pipeline.annotate(document);

									        // Вывод токенов
								        
								       
								
document.get(CoreAnnotations.SentencesAnnotation.class).forEach(sentence -> {								                     sentence.get(CoreAnnotations.TokensAnnotation.class).forEach(token -> {
 System.out.println(token.word());																		
		}}
		});								                                                           						                                                             }
