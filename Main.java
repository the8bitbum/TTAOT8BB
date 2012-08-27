/*
 * The 8-Bit Bum's game, this is my entry for the contest,
 * for the sake of documentation and making it easier for
 * others to learn from my code, I will comment on each
 * new piece prior to it showing up to explain what it means
 * (I learned most of this as I went along). So sit back, relax,
 * and enjoy the code. any "/*" comments are about the code
 * and any "//" are about the story supplementary or just
 * for story concurrency reference. 
 *
 * The import is for input it acts like 
 * an action listener but allows me to add
 * integers for cleaner code... I THINK.
 */
import java.util.Scanner;

/*
 * This is an auto generated public class 
 * definition that is required for all 
 * java classes (a class is the thing
 * that actually is the application).
 */
public class Main {
	/*
	 * This is the private method 
	 * is the implementation 
	 * that allows the implemntation
	 * of the above import.
	 */
	private static Scanner scanner;
	/*
	 * The following is an obvious one but I will put 
	 * in the comment anyways because I did not know it
	 * until I started it is the main method that allows
	 * the game to actually work.
	 */
	public static void main(String args[]) {
		/*
		 * This the implementation of the private
		 * within the main method I had to put in there
		 * almost as a formula for how to set up scanners later
		 */
		scanner = new Scanner(System.in);
		
		/*
		 * Something every text based game needs the 
		 * System.out.println piece of code is what
		 * allows you to actually make the text show
		 * in the console if you have written a 
		 * helloWorld application you used this most likely.
		 */
		System.out.println("Random Voice: You find yourself... HEY WAKE UP!");
		/* For newer programmers the next line has to do with 
		 * a public method at the very bottom, that invokes
		 * a 2 second wait period between lines if you see multiple
		 * lines of it it is because I am giving you time to read it.
		 * I implemented this because it makes it cleaner and quicker,
		 * than having to code in a new waiting method for each new line
		*/
		sleep();
		System.out.println("The 8-Bit Bum: Huh, what where are you? Get out of my apartment!");
		sleep();
		System.out.println("Random Voice: I am the Narrator and you're in a video game \nand I will not be leaving any time soon.");
		sleep();
		sleep();
		System.out.println("Choices: \n1. Ignore the voice and go back to sleep. \n2. Ask the voice what it wants.");
		sleep();
		sleep();
		/*
		 * The following line looks similar
		 * to System.out.prinln, but is not.
		 * It allows you to place your choice
		 * next to it in the same line instead
		 * of making you do it in the next line
		 * on the console.
		 */
		System.out.print("Choice: ");
		/* 
		 * Remember that formula I talked about earlier?
		 * Well this is it for setting up the choices you,
		 * the player, will make in the game the a has 
		 * to do with this instance as you will see below
		 * the next instances of choices will have different
		 * letters assigned to them.
		 */
		int a = scanner.nextInt();
		
		/*
		 * The switch statement, works similar to an
		 * If else statement (explained below) however,
		 * it allows for cases which can be used later
		 * and is a little bit cleaner in my opinion 
		 */
		switch(a) {
		/*
		 * The following piece of code is a part of a switch,
		 * it works similarly to the part that would come after
		 * if (blank == blank) It will make more sense once we
		 * actually reach the "If else if statement later.
		 */
		case 1:
			System.out.println("Narrator: HEY, HEY WAKE UP WAKE UP!");
			sleep();
			System.out.println("The 8-Bit Bum: Fine, what do you want?");
			sleep();
			System.out.println("Narrator: I am here to lead you on a quest, the quest to end all quests!");
			/*
			 * The break is for ending a case in a switch; simple
			 * as that it is basically a semicolon for the case.
			 */
			break;
		case 2:
			System.out.println("The 8- Bit Bum: What do you want?");
			sleep();
			System.out.println("Narrator: I am here to lead you on a quest, the quest to end all quests!");
			break;
		}
		sleep();
		System.out.println("The 8-Bit Bum: Well what is this quest for?");
		sleep();
		System.out.println("Narrator: Well... um... I actually dont know. \nMaybe you should ask around town see who might know.");
		sleep();
		System.out.println("The 8-Bit Bum: I live in the 16-Bit City it has 3000 people...");
		sleep();
		System.out.println("Narrator: Oh well go ask someone important like \nthe Mayor or someone smart you may know.");
		sleep();
		System.out.println("Chocies: \n1. Mayor \n2. The Guy next door");
		sleep();
		sleep();
		System.out.print("Choice: ");
		int b = scanner.nextInt();
		
		switch(b) {
		case 1:
			System.out.println("You head to the mayor's office...");
			sleep();
			System.out.println("Secretary: May I ask the nature of your visit?");
			sleep();
			System.out.println("The 8-Bit Bum: I am here to ask the Mayor if he has a quest for me.");
			sleep();
			System.out.println("Secretary: Do you have an appointment?");
			sleep();
			System.out.println("The 8-Bit Bum: No... but I do have a narrator.");
			sleep();
			System.out.println("Secretary: well then you want to get in that line it is a five hour wait.");
			sleep();
			System.out.println("Narrator: Come on lets go ask the guy next door.");
			sleep();
			System.out.println("You go to your neighbor Frank's and tell him about how you are \nare looking for a quest, and he says to come back \nin a bit to get it a proper questing form");
			break;
		case 2:
			System.out.println("You head next door.");
			sleep();
			System.out.println("The 8-Bit Bum: Hey Frank.");
			sleep();
			System.out.println("Frank: Hey, well if it isnt The 8-Bit Bum. How have you been bummin as usual?");
			sleep();
			System.out.println("The 8-Bit Bum: Well I was wondering if you had any quest or knew of anyone who did?");
			sleep();
			System.out.println("Frank: I might just know of something give me a bit to prepare a proper questing form.");
			break;
		}
		
		sleep();
		System.out.println("2 Hours later...");
		sleep();
		System.out.println("Narrator: After wating for two hours The (Gets Cut Off)");
		sleep();
		System.out.println("The 8-Bit Bum: SHUTUP I am about to go into his apartment I dont want to hear a peep out of you!");
		sleep();
		System.out.println("Narrator: Fine...");
		sleep();
		System.out.println("*KNOCKING*");
		sleep();
		System.out.println("The 8-Bit Bum: Hey Frank are you ready yet?");
		sleep();
		System.out.println("Frank: One Second Pal I'll be right there.");
		sleep();
		System.out.println("The 8-Bit Bum: So do you have a quest for me.");
		sleep();
		System.out.println("Frank: I actually have two quests for you to choose from.");
		sleep();
		System.out.println("The 8-Bit Bum: Oh, now arent you just the good friend?");
		sleep();
		System.out.println("Frank: The first quest has you going around the city looking for a certain item. \nThe second quest has you going off to fight a mighty beast in the middle of the woods.");
		sleep();
		sleep();
		System.out.println("Narrator: Can I talk now? Because I have a suggestion.");
		sleep();
		System.out.println("Frank: WOAH who was that?");
		sleep();
		System.out.println("The 8-Bit Bum: Oh that is my narrator the only reason I am doing this thing... \nNow time to choose and no I will not listen to you Narrator.");
		sleep();
		System.out.println("Narrator: The dev says... this is where you're choices actually start to matter!");
		
		//NOT REALLY TROLOLOLOLOL... at least not yet.
		
		sleep();
		System.out.println("Choices: \n1. Find The Item!, \n2. Fight The Beast!");
		sleep();
		sleep();
		System.out.print("Choice:");
		int c = scanner.nextInt();
		
		switch(c) {
		case 1:
			sleep();
			System.out.println("The 8-Bit Bum: I choose to serarch for the item!");
			sleep();
			System.out.println("Frank: Good Choice.");
			sleep();
		break;
		case 2:
			sleep();
			System.out.println("The 8-Bit Bum: I choose to defeat the beast!");
			sleep();
			System.out.println("Frank: Good Choice.");
			sleep();
		break;
		}
		
		/*
		 * Ah the aforementioned "If else if" statement,
		 * let me begin by explaining an "If else statement,
		 * they begin the same (see the next line of code,
		 * however once you get to the else, instead of it being,
		 * just if it is any thing else, it spits out the line,
		 * it becomes more specific by adding in... well look
		 * lower I will explain it at the else if part statement.
		 */
		
		if (c == 1) {
		System.out.println("The Item you are looking for, is the Mystical Staff of Blasting.");
		sleep();
		System.out.println("The 8-Bit Bum: Okay any idea where to start?");
		sleep();
		System.out.println("Frank: Oh it is in The Dungeon Of The Sewer Gator.");
		sleep();
		System.out.println("Narrator: DUN DUN DUNNNNNNN!");
		sleep();
		System.out.println("The 8-Bit Bum: No one asked for the sound effects.");
		sleep();
		System.out.println("Frank: You should be nicer to your Narrator.");
		sleep();
		System.out.println("Narrator: YEAH!");
		sleep();
		System.out.println("The 8-Bit Bum: No... so how do I get to The Dungeon of The Sewer Gator?");
		sleep();
		System.out.println("Frank: You go down to the sewer and follow the signs.");
		sleep();
		System.out.println("The 8-Bit Bum: That sounds easy enough.");
		sleep();
		System.out.println("Frank: Yeah it sounds easy... \nbut the path is filled iwth monsters");
		/*
		 * This is where it becomes different
		 * from a regular "If else" statement,
		 * it makes it so it requires a specific
		 * more specific input to spit out the
		 * words the player wants to see.
		 */
		} else {
			if (c == 2) {
				System.out.println("The 8-Bit Bum: Okay so how do I get to the Beast");
				sleep();
				System.out.println("Frank: Ahh settle down Eagar one... \nfirst the beast is called the(cutoff)");
				sleep();
				System.out.println("8-Bit: I dont care what its called how do i find it");
				sleep();
				sleep();
				System.out.println("Frank: Well it is in the woods and you \nwill know it by its smell, the smell of roses");
			}
		}

		sleep();
		System.out.println("8-Bit Well I am off!");
		sleep();
		System.out.println("Frank: Good Luck!");
		sleep();
		sleep();
		System.out.println("Narrator: You now have two choices now: \nyou can gather supplies \nor head out immediately.");
		sleep();
		System.out.println("Choices: \n 1.Gather Supplies \n2. Go ahead");
		sleep();
		sleep();
		System.out.print("Choice: ");
		int d = scanner.nextInt();
		
		switch(d){
		case 1:
			sleep();
			System.out.println("You gather supplies and collect the required materials.");
			break;
		case 2:
			sleep();
			System.out.println("You go ahead on your merry way");
			break;
		}
		
		/*
		 * The && makes it so i can split it off into multiple
		 * stories based on your previous choices, the following
		 * example is if you chose to find the item, and gear up
		 * before leaving on your majestic quest; alternatively if
		 * I wanted to make it you chose to find the item or gear
		 * up i could of used || instead of && but that does not work
		 * for what we are doing..
		 */
		if (c == 1 && d == 1) {
			// story line A Regular Beginning
			sleep();
			System.out.println("Narrator: Our hero sets out equipped to the teeth \nand ready to find the Mystical Staff of Blasting ");
			sleep();
			System.out.println("8-Bit: So you are not going anywhrere right?");
			sleep();
			System.out.println("Narrator: Nope... All of a sudden an sewer rat appears");
			sleep();
			System.out.println("8-Bit: OH CRAP WHAT THE HECK *slashes sword*");
			sleep();
			System.out.println("Narrator (in a different voice): The 8-Bit Bum Gained \nfive experience");
			sleep();
			System.out.println("8-Bit: What was up with that?");
			sleep();
			System.out.println("Narrator (normal voice): I dont know");
			sleep();
			System.out.println("8-Bit: Well... let's not do that again.");
			sleep();
			System.out.println("Narrator: I will try.");
			sleep();
			System.out.println("Hey there is the first sign.");
			sleep();
			/*
			 * Here is the first sign for the Dungeon of
			 * the Sewer Gator, I thought i would make it
			 * the way it is because i thought it would be
			 * more fun I think it came out nice oh yeah in
			 * order to make the vertical lines (It took me
			 * forever to figure this one out) you press 
			 * Shift \ I never knew that until I 
			 * started this game...
			 */
			System.out.println("_________________");
			System.out.println("| Weclome to the|");
			System.out.println("|    Dungeon    |");
			System.out.println("|  Continue at  |");
			System.out.println("|   Own Risk!   |");
			System.out.println("|_______________|");
			System.out.println("       | |       ");
			sleep();
			sleep();
			sleep();
			System.out.println("Narrator and 8-Bit: Well, lets go on in!");
		} else {
			if (c == 1 && d == 2) {
				//Story line A alternate beginning.
				System.out.println("Narrator: our hero sets out with nothing but \nhis bare hands and his wits about him.");
				sleep();
				System.out.println("8-Bit: So you are not going anywhrere right?");
				sleep();
				System.out.println("Narrator: Nope... All of a sudden an sewer rat appears");
				sleep();
				System.out.println("8-bit: AHH What the heck!");
				sleep();
				System.out.println("Narrator differnt voice: The 8-Bit Bum has been slain...");
				sleep();
				System.out.println("Narrator regular voice: What, No, NOOOOOO how is he to finish his quest?");
				sleep();
				System.out.println("8-Bit: *Respawns* Woah that was weird, \n but hey I guess becase I am in a game I had an extra life.");
				sleep();
				System.out.println("Narrator: Oh thank goodness! You are okay.");
				sleep();
				System.out.println("8-bit: Yeah but I say we go get some gear and try again.");
				sleep();
				System.out.println("Narrator: Our hero returns to the 16-Bit city \nand gathers supplies, he then returns to the dungeon and continues on.");				
			/*
			 * This next part at least seems
			 * messy to me but it is necessary
			 * for me to make separate, branching,
			 * story lines. So sit tight and hold
			 * on it is about to get turbulent.
			 * And oh yeah, THIS is where your 
			 * choices really start to matter.
			 */
				
			 // And it really starts to become more action based in story line B.
			} else {
				if (c == 2 && d == 1) {
					//Story line B1
					sleep();
					System.out.println("Narrator: Our hero sets out equipped to the teeth. \nReady to fight the Baest of...");
					sleep();
					System.out.println("of well we dont know what it is called becuase someone (cut off)");
					sleep();
					System.out.println("8-Bit: Do you ever shutup?!");
					sleep();
					System.out.println("Narrator: well you could Mute the user could mute \nthe game but then they couldnt here you either");
					sleep();
					System.out.println("...and it would probably crash the game.");
					sleep();
					System.out.println("8-Bit to the player: Please for the love of The 32-Bit One \nMute the game!");
					sleep();
					System.out.println("Choices: \n1. Mute the game \n2. Dont Mute the game.");
					sleep();
					sleep();
					System.out.print("Choice: ");
					int e = scanner.nextInt();
					
					switch(e){
					case 1:
						System.out.println("You mute the game... It crashes... please restart");
						break;
					case 2:
						System.out.println("You choose not to mute the game Hooray you would have crashed it otherwise.");
						break;
					}
					if (e == 2){
						sleep();
						System.out.println("Narrator and 8-Bit: Phew that was close.");
						sleep();
						System.out.println("8-Bit: Alright now lets carry on with the quest.");
						
					}
			} else {
				if (c == 2 && d == 2){
					//Story line B2
					sleep();
					System.out.println("Narrator: Our hero sets out with nothing but his bare hands and wits about him. \nReady to fight the Baest of...");
					sleep();
					System.out.println("of well we dont know what it is called becuase someone (cut off)");
					sleep();
					System.out.println("8-Bit: Do you ever shutup?!");
					sleep();
					System.out.println("Narrator: well you could Mute the user could mute \nthe game but then they couldnt here you either");
					sleep();
					System.out.println("...and it would probably crash the game.");
					sleep();
					System.out.println("8-Bit to the player: Please for the love of The 32-Bit One \nMute the game!");
					sleep();
					System.out.println("Choices: \n1. Mute the game \n2. Dont Mute the game.");
					sleep();
					sleep();
					System.out.print("Choice: ");
					int f = scanner.nextInt();
					
					switch(f){
					case 1:
						System.out.println("You mute the game... It crashes... please restart");
						break;
					case 2:
						System.out.println("You choose not to mute the game Hooray you would have crashed it otherwise.");
						break;
					}
					if (f  == 2) {
						sleep();
						System.out.println("Narrator and 8-Bit: Phew, that was close.");
						sleep();
						System.out.println("8-Bit: Alright now lets get on with the quest.");
					}
				}
			}
		}
	}
		if (c == 1 && d == 1 || d == 2) {
			//Story line A (continued)
			sleep();
			System.out.println("Narrator: You come across the map of the dungeon... its big.");
			sleep();
			System.out.println(" __________________________________________");
			System.out.println("| You are here ->O___________              |");
			System.out.println("|    ___________________|    |_______      |");
			System.out.println("|   /    |______________|___/        |     |");
			System.out.println("|  |     |__________________|________|__   |");
			System.out.println("|  |_____/     |_____    |      ________|  |");
			System.out.println("|                    |___|_____/           |");
			System.out.println("| You want to be   ___|________|    ~~~~~~ |");
			System.out.println("| here|  _________|    ____/        ~~~~~~ |");
			System.out.println("|     |_>X        |___/             ~~~~~~ |");
			System.out.println("|__________________________________________|");
			System.out.println("    | |                             | |    ");
			System.out.println("    | |                             | |    ");
			System.out.println("    | |                             | |    ");
			sleep();
			sleep();
			sleep();
			sleep();
			System.out.println("8-Bit: Ah *bleep* this is probably the wierdest map I have every seen.");
			sleep();
			System.out.println("Narrator: Yep...");
			sleep();
			System.out.println("8-Bit: Any idea which way we should go?");
			sleep();
			System.out.println("Narrator: Well someone has writen notes in the bottom corner.");
			sleep();
			System.out.println("8-Bit: Let's see what they say.");
			sleep();
			System.out.println("*Read aloud by 8-Bit.*");
			System.out.println(" _______________________________________");
			System.out.println("| Note to self for the 64-bit Plumber:  |");
			System.out.println("| Remember you found the right way...   |");
			System.out.println("| You werent prepared for the monsters, |");
			System.out.println("| The path is: First right, then the    |");
			System.out.println("| next imediate right, then the first   |");
			System.out.println("| left, then it is right, then second   |");
			System.out.println("| second left, then left again, then    |");
			System.out.println("| right, then the imideate right, then  |");
			System.out.println("| then a left, then yet another left,   |");
			System.out.println("| then the last right, and finally a    |");
			System.out.println("| ~~~~~~~~                              |");
			System.out.println("|_______________________________________|");
			sleep();
			sleep();
			sleep();
			sleep();
			sleep();
			System.out.println("Narrator: What is the last turn?");
			sleep();
			System.out.println("8-Bit: It ends there and there is a blood stain");
			sleep();
			// This next part starts as a dark joke, but ends on the lighter side.
			System.out.println("Narrator: Okay don't freak out but, look to your left!!!");
			sleep();
			System.out.println("8-Bit: What?");
			sleep();
			System.out.println("Narrator: You look to the left and see a rather short skeleton \nwith a white hat embossed with a red M \nand a pair of white overalls, \na A red shirt and a pair of brown shoes.");
			sleep();
			System.out.println("8-Bit: So that is what caused Mr. Jumpman amnesia that day. May his play through rest in piece...");
			sleep();
			System.out.println("Narrator: Are you going to loot the body? It may have a quest item.");
			sleep();
			System.out.println("8-Bit: What!? No way, that life that he lost here was way to cool to loot.");
			sleep();
			System.out.println("Narrator: Well... here we go.");
			sleep();
			System.out.println("8-Bit: ...Really?");
			sleep();
			System.out.println("Narrator: What?");
			sleeep();
			System.out.println("8-Bit: Nevermind, it is on like an eighty's pixelated gorrila.");
			sleep();
			System.out.println("Narrator: And you said 'Really?' to me"?);
			sleep();
			System.out.println("8-Bit: Whatever lets just go; we are wasting time.");
			// Huh, Huh, you get it?
			sleep();
			System.out.println("Narrator: Our hero makes his way into the dungeon ready to find /nThe Mystical Staff of Blasting.");
			sleep();
			
			
		}
	}	
	/*
	 * This is the method for my sleep command
	 * I have liberally applied throughout the
	 * code, the 2500 has to do with how long
	 * it will wait between lines of text
	 * 2000 milliseconds or 2 seconds.
	 */
	public static void sleep() {
		try {
		Thread.sleep(2000);
		} catch (Exception exc){}
	}
	/*
	 * Thus ends the code for The Texty Adventures of The 8- Bit Bum,
	 * I hope you enjoyed the ride as this is my first game, so the
	 * story (and the code) may seem a bit rough around the edges
	 * I plan on adding more updates and more story every once
	 * and a while and I will keep you all in the loop.
	 */
}
