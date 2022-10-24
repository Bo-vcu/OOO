package ui;

//UI can only import Shop
import domain.Shop;

import javax.swing.*;

public class UI {
	private final Shop shop;
	public UI(Shop shop) {
		this.shop = shop;
		showMenu();
	}

	public void showMenu() {
		String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. All products\n5. Manage product\n\n0. Quit";
		String  choice = "";
		while (!choice.equals("0")) {
			choice = JOptionPane.showInputDialog(menu);
			if (choice == null || choice.isEmpty()) {
				break;
			} else {
				switch (choice) {
					case "1":
						addProduct();
						break;
					case "2":
						showProduct();
						break;
					case "3":
						showPrice();
						break;
					case "4":
						showAllProducts();
						break;
					case "5":
						manageProduct();
						break;
					default:
						menu = "Invalid option!\n" + menu;
				}
			}
		}
	}

	private boolean productExists(String idString) {
		try {
			int id = Integer.parseInt(idString);
			shop.getProductByID(id); //Test if product exists
			return true;
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Invalid ID!");
			return false;
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}

	private String getID() {
		return JOptionPane.showInputDialog("Enter the id:");
	}

	public void addProduct() {
		String title = JOptionPane.showInputDialog("Enter the title:");
		if (title == null) return;
		String type = JOptionPane.showInputDialog(""+
				"Enter the type:"+
				"\nC - CD"+
				"\nG - Game"+
				"\nM - Movie");
		if (type == null) return;
		try {
			shop.addProduct(type, title);
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void showAllProducts() {
		String s = shop.getProductsInOrder();
		JOptionPane.showMessageDialog(null, s);
	}

	public void showProduct() {
		String idString = getID();
		if (productExists(idString)) {
			int id = Integer.parseInt(idString);
			JOptionPane.showMessageDialog(null, shop.getProductByID(id));
		}
	}

	public void showPrice() {
		String idString = getID();
		if (productExists(idString)) {
			int id = Integer.parseInt(idString);
			String days = JOptionPane.showInputDialog(shop.getProductByID(id) + "\n\nEnter the number of days:");
			try {
				JOptionPane.showMessageDialog(null, shop.getPrice(Integer.parseInt(days), id));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid number of days!");
			}
		}
	}

	private void manageProduct() {
		String idString = getID();
		if (productExists(idString)) {
			int id = Integer.parseInt(idString);
			String choice = JOptionPane.showInputDialog(shop.getProductByID(id) + ""+
				"Options:"+
				"\n1. Rent"+
				"\n2. Set available"+
				"\n3. Set damaged"+
				"\n4. Fix damage"+
				"\n5. Remove product");

			try {
				switch (choice) {
					case "1":
						setRented(id);
						break;
					case "2":
						setAvailable(id);
						break;
					case "3":
						setDamaged(id);
						break;
					case "4":
						fixDamage(id);
						break;
					case "5":
						remove(id);
						break;
				}

			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}

	private void remove(int id) {
		try {
			shop.remove(id);
			JOptionPane.showMessageDialog(null, "Product successfully removed.");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void fixDamage(int id) {
		try {
			shop.fixDamage(id);
			JOptionPane.showMessageDialog(null, "Product successfully repaired.");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void setDamaged(int id) {
		try {
			shop.setDamaged(id);
			JOptionPane.showMessageDialog(null, "Product successfully set as damaged.");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void setAvailable(int id) {
		try {
			shop.setAvailable(id);
			JOptionPane.showMessageDialog(null, "Product successfully set as available.");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private void setRented(int id) {
		try {
			shop.setRented(id);
			JOptionPane.showMessageDialog(null, "Product successfully set as not available.");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
