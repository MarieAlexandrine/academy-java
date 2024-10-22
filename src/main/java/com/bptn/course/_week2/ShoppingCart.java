package com.bptn.course._week2;

class ShoppingCart {
	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// add product to cart
	public void addProductToCart(Product product, int quantity) {
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock(quantity);
	}

	// show products in cart
	public CartItem[] productInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		
			for (int i = 0; i < itemCount; i++) {
				currentItems[i] = items[i];
			}	
			return currentItems;
			

		}
	}

