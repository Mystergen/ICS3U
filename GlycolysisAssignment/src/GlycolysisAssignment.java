/**
 * DoYouKnowYourGlycolysisInDetail
 * Test user on glycolysis steps
 * April 2 2017
 * @author ethanzhou
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GlycolysisAssignment{
	static InputStreamReader iso = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(iso);
	
	public static void main(String[] args) throws IOException{
		double counter = 0;
		boolean pit = false;
		System.out.println("You will be playing a game as a team to test and learn about glycolysis. This game is a majority rules game, please click enter to continue");
		do{
		do{
		System.out.println("What is glycolysis? \n a)the break down of glucose into energy molecules \n b)the use of glucose as energy");//this is the question, options are a or b (multiple choice)
		String ans1 = incorrect(br.readLine());//this line of code lets the player input their answer
		if (ans1.equals("a")){//this line of code checks if the answer is correct or not
			System.out.println("Where does glycolysis occur? \n a)in the cytoplasm \n b)in the mitochondria");
			String ans2 = incorrect(br.readLine());
			if (ans2.equals("a")){
				System.out.println("What happens in step one? \n a)glucose is rearranged into a fructose \n b)glucose is phosphorylated by ATP");
				String ans3 = incorrect(br.readLine());
				if (ans3.equals("b")){
					System.out.println("What does step one do? \n a)gets it prepared for creating NADH \n b)prevents glucose from leaving cell");
					String ans4 = incorrect(br.readLine());
					if (ans4.equals("b")){
						System.out.println("What happens in step two? \n a)the fructose molecule is rearranged back into a glucose \n b)the phosphorylated glucose molecule is rearranged into a phosphorylated fructose");
						String ans5 = incorrect(br.readLine());
						if (ans5.equals("b")){
							System.out.println("What happens in step three \n a)the fructose molecule is phosphorylated \n b)the glucose molecule is phosphorylated");
							String ans6 = incorrect(br.readLine());
							if (ans6.equals("a")){
								System.out.println("What happens to the molecule after step three? \n a)becomes unstable \n b)becomes stable");
								String ans7 = incorrect(br.readLine());
								if(ans7.equals("a")){
									System.out.println("What happens does kinase mean? \n a)transfer of phosphate \n b)condensation");
									String ans8 = incorrect(br.readLine());
									if(ans8.equals("a")){
										System.out.println("What happens in step four? \n a)fructose is unstable from step three, so molecule is split into two molecules \n b)fructose is stable from step three, so molecule splits into two molecules");
										String ans9 = incorrect(br.readLine());
										if (ans9.equals("a")){
											System.out.println("What does lyase mean? \n a) joining of specific molecules/group by triple bonds \n b)joining of specific molecules/group by double bonds");
											String ans10 = incorrect(br.readLine());
											if (ans10.equals("b")){
												System.out.println("The product of step for is: \n a)Two glyceraldehyde phosphate \n b)One glyceraldehyde phosphate and One dihydroxyacetone phosphate");
												String ans11 = incorrect(br.readLine());
												if (ans11.equals("b")){
													System.out.println("What happens in step five? \n a)dihyroxyacetone phosphate is converted to a glyceraldehyde phosphate \n b)glyceraldehyde phosphate is converted into dihydroxyacetone phosphate");
													String ans12 = incorrect(br.readLine());
													if (ans12.equals("a")){
														System.out.println("What is a isomerization reaction? \n a)changed arrangment of molecules \n b)adding electron");
														String ans13 = incorrect(br.readLine());
														if (ans13.equals("a")){
															System.out.println("What happens in step six? \n a)NADH is produced and nothing else happens \n b)NAD+ gains 2 electrons and hydrogen and produces NADH and glyceraldehyde phosphate gains another phosphate");
															String ans14 = incorrect(br.readLine());
															if (ans14.equals("b")){
																System.out.println("What happens in step seven? \n a)ADP is phosphorylated by 1,3-biphosphoglycerate(molecule made from previous reaction) and produces ATP \n b)ATP is used to phosphorylate more glucose molecues");
																String ans15 = incorrect(br.readLine());
																if (ans15.equals("a")){
																	System.out.println("What happens in step eight? \n a)ADP is phosphylated to make ATP \n b)the phosphate group is rearranged");
																	String ans16 = incorrect(br.readLine());
																	if (ans16.equals("b")){
																		System.out.println("What happens in step nine? \n a)dehydration synthesis occurs and makes molecule less stable. This produces phosphenolpyruvate \n b)hydratoin occurs and produces pyruvate");
																		String ans17 = incorrect(br.readLine());
																		if (ans17.equals("a")){
																			System.out.println("What happens in step ten? \n a)ADP is phosphorylated by the phosphoenolpyruvate and becomes ATP also producing a pyruvate \n b)the phosphoenolpyruvate gives a phosphate to ADP to become ATP, then multiplies to create another ATP");
																			String ans18 = incorrect(br.readLine());
																			if (ans18.equals("a")){
																				System.out.println("You have succeded");
																			}else{
																				System.out.println("incorrect");counter++;
																			}
																		}else{
																			System.out.println("incorrect");counter++;
																		}
																	}else{
																		System.out.println("incorrect");counter++;
																	}
																	
																}else{
																	System.out.println("incorret");counter++;
																}
															}else{
																System.out.println("incorrect");counter++;
															}
														}else{
															System.out.println("incorrect");counter++;
														}
													}else{
														System.out.println("incorrect");
														counter++;
													}
												}else{
													System.out.println("incorrect");
													counter++;
												}
											}else{
												System.out.println("incorrect");
												counter++;
											}
										}else{
											System.out.println("incorrect");
											counter++;
										}
									}else{
										System.out.println("incorrect");
										counter++;
									}
								}else{
									System.out.println("incorrect");
									counter++;
								}
							}else{
								System.out.println("incorrect");
								counter++;
							}
						}else{
							System.out.println("incorrect");
							counter++;
						}
					}else{
						System.out.println("incorrect");	
						counter++;
					}
				}else{
					System.out.println("incorrect");
					counter++;
				}
			}else{
				System.out.println("incorrect");
				counter++;
			}
		}else{
			System.out.println("incorrect");
			counter++;
		}
		}while(counter < 8 && counter != 0);
		if (counter == 8){
			System.out.println("You Need to Study a little more");
		}
		System.out.println("You have gotten " + Math.round((18-counter)/18*100) + "%");
		System.out.println("Do you want to play again \n a)yes \n b)no");
		String playAg = incorrect((br.readLine()));
		if (playAg.equals("b")){
			pit = true;
		}
		counter = 0;
		}while(pit == false);
	}

/**
 * Tells/check the player that they have entered an invalid option, and should put in a valid answer
 * @param ans is multiple choice, so player can only pick a or b
 * @return returns the answer they have inputed if it is a or b
 * @throws IOException
 */
	public static String incorrect (String ans) throws IOException{
		do{
		if (!ans.equals("a") && !ans.equals("b")){
			System.out.println("Please enter a valid answer");
			ans = br.readLine();
		}
		}while (!ans.equals("a") && !ans.equals("b"));
		return ans;
	}
	
}