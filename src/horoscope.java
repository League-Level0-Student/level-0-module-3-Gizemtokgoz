import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	
	String star = JOptionPane.showInputDialog("What is your star sign ?");
	 
	 if (star.equalsIgnoreCase("aries")) {
		 JOptionPane.showMessageDialog(null, "As the first sign in the zodiac, the presence of Aries always marks the beginning of something \n energetic and turbulent. They are continuously looking for dynamic, speed and competition, always \n being the first in everything - from work to social gatherings. Thanks to its ruling planet Mars and the fact \n it belongs to the element of Fire (just like Leo and Sagittarius), Aries is one of the most active \n zodiac signs. It is in their nature to take action, \n sometimes before they think about it well.");
	 }
	 
	 else if (star.equalsIgnoreCase("taurus")) {
		 JOptionPane.showMessageDialog(null, "Practical and well-grounded, Taurus is the sign that harvests the fruits of labor. They feel \n the need to always be surrounded by love and beauty, turned to the material world, hedonism, and \n physical pleasures. People born with their Sun in Taurus are sensual and tactile, considering touch and taste the \n most important of all senses. Stable and conservative, this is one of the most reliable signs of the zodiac, \n ready to endure and stick to their choices until they reach the point of personal satisfaction.");
	 }
	 
	 else if (star.equalsIgnoreCase("gemini")) {
		 JOptionPane.showMessageDialog(null, "Expressive and quick-witted, Gemini represents two different personalities in one and you will \n never be sure which one you will face. They are sociable, communicative and ready for fun, with \n a tendency to suddenly get serious, thoughtful and restless. They are fascinated with the world itself, extremely \n curious, with a constant feeling that there is not enough \n time to experience everything they want to see.");
	 }
	 
	 else if (star.equalsIgnoreCase("cancer")) {
		 JOptionPane.showMessageDialog(null, "Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. \n They are very emotional and sensitive, and care deeply about matters of the family and \n their home. Cancer is sympathetic and attached to people they keep close. Those born with their Sun in Cancer are very \n loyal and able to empathize with other people's pain and suffering.");
	 }
	 
	 else if (star.equalsIgnoreCase("leo")) {
		 JOptionPane.showMessageDialog(null, "People born under the sign of Leo are natural born leaders. They are dramatic, creative, self-confident, dominant \n and extremely difficult to resist, able to achieve anything they want to in any \n area of life they commit to. There is a specific strength to a Leo and their \"king of the jungle\" status. Leo \n often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun sign \n capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy \n sense of humor makes collaboration with other people even easier.");
	 }
	 
	 else if (star.equalsIgnoreCase("virgo")) {
		 JOptionPane.showMessageDialog(null, "Virgos are always paying attention to the smallest details and their deep sense of humanity makes \n them one of the most careful signs of the zodiac. Their methodical approach to life ensures that \n nothing is left to chance, and although they are often tender, their heart might be closed for the outer world. \n This is a sign often misunderstood, not because they lack the ability to express, but because they won’t \n accept their feelings as valid, true, or even relevant when opposed to reason. The symbolism behind the name speaks \n well of their nature, born with a feeling they are experiencing everything for the first time.");
	 }
	
	 else if (star.equalsIgnoreCase("libra")) {
		 JOptionPane.showMessageDialog(null, "People born under the sign of Libra are peaceful, fair, and they hate being alone. Partnership \n is very important for them, as their mirror and someone giving them the ability to be the mirror \n themselves. These individuals are fascinated by balance and symmetry, they are in a constant chase for justice and \n equality, realizing through life that the only thing that should be truly important to themselves in their \n own inner core of personality. This is someone ready to do nearly anything to avoid conflict, keeping the peace \n whenever possible");
	 }
	 
	 else if (star.equalsIgnoreCase("scorpio")) {
		 JOptionPane.showMessageDialog(null, "Scorpio-born are passionate and assertive people. They are determined and decisive, and will \n research until they find out the truth. Scorpio is a great leader, always aware of the situation and \n also features prominently in resourcefulness.Scorpio is a Water sign and lives to experience and express emotions. \n Although emotions are very important for Scorpio, they manifest them differently than other water signs. \n In any case, you can be sure that the Scorpio will keep your secrets, whatever they may be.");
	 }
	 
	 else if (star.equalsIgnoreCase("sagittarius")) {
		 JOptionPane.showMessageDialog(null, "Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs. Their open \n mind and philosophical view motivates them to wander around the world in search of the meaning \n of life.Sagittarius is extrovert, optimistic and enthusiastic, and likes changes. Sagittarius-born are able to \n transform their thoughts into concrete actions and they will do anything to achieve their goals.");
	 }
	 
	 else if (star.equalsIgnoreCase("capricorn")) {
		 JOptionPane.showMessageDialog(null, "Capricorn is a sign that represents time and responsibility, and its representatives are traditional \n and often very serious by nature. These individuals possess an inner state of independence that \n enables significant progress both in their personal and professional lives. They are masters of self-control \n and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them \n at any time. They will learn from their mistakes and get to the top based solely on their \n experience and expertise.");
	 }
	 
	 else if (star.equalsIgnoreCase("acquarius")) {
		 JOptionPane.showMessageDialog(null, "Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic. \n However, in both cases, they are deep thinkers and highly intellectual people who love helping others. \n They are able to see without prejudice, on both sides, which makes them people who can easily solve problems.Although \n they can easily adapt to the energy that surrounds them, Aquarius-born have a deep need to be some time \n alone and away from everything, in order to restore power. People born under the Aquarius sign, look at \n the world as a place full of possibilities.");
	 }
	 
	 else if (star.equalsIgnoreCase("pisces")) {
		 JOptionPane.showMessageDialog(null, "Pisces are very friendly, so they often find themselves in a company of very different people. \n Pisces are selfless, they are always willing to help others, without hoping to get anything back. \n Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity.");
	 }
	 
	 else {
		 JOptionPane.showMessageDialog(null, "That's not a star sign!");
	 }
}
}
