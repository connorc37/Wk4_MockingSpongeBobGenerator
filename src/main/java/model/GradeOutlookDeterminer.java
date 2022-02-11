package model;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */
public class GradeOutlookDeterminer {
	
	String outlook;

	public GradeOutlookDeterminer() {
		super();
	}

	public GradeOutlookDeterminer(String outlook) {
		super();
		this.outlook = outlook;
		setOutlook(outlook);
	}

	public String getOutlook() {
		return outlook;
	}

	public void setOutlook(String outlook) {
		
		if (outlook.equals("y")) {
			
			double randomDouble = Math.random() * 14;
			int randomInt = (int) randomDouble;
			
			switch(randomInt) {
			case 0:
				this.outlook = "It is certain.";
				break;
			case 1:
				this.outlook = "It is decidedly so.";
				break;
			case 2:
				this.outlook = "Without a doubt.";
				break;
			case 3:
				this.outlook = "Yes - definitely.";
				break;
			case 4:
				this.outlook = "You may rely on it.";
				break;
			case 5:
				this.outlook = "As I see it, yes.";
				break;
			case 6:
				this.outlook = "Most likely.";
				break;
			case 7:
				this.outlook = "Outlook good.";
				break;
			case 8:
				this.outlook = "Signs point to yes.";
				break;
			case 9:
				this.outlook = "Reply hazy, try again.";
				break;
			case 10:
				this.outlook = "Ask again later.";
				break;
			case 11:
				this.outlook = "Better not tell you now.";
				break;
			case 12:
				this.outlook = "Cannot predict now.";
				break;
			case 13:
				this.outlook = "Concentrate and ask again.";
				break;
			default:
				this.outlook = "Yes.";
			}
			
		}
		else {
			this.outlook = "I DoN'T WaNt tO KnOw iF ThIs aSsEsSmEnT Is wOrThY Of aN A.";
			// this.outlook = outlook;
		}
		
	}	

}
