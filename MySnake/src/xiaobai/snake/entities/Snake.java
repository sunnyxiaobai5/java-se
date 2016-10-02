package xiaobai.snake.entities;

import java.util.HashSet;
import java.util.Set;

import xiaobai.snake.listener.SnakeListener;

public class Snake {
	
	private Set<SnakeListener> listeners = new HashSet<SnakeListener>();
	
	public void move(){
		System.out.println("Snake's move");
	}
	
	public void chageDirection(){
		System.out.println("Snake's chageDirection");
	}
	
	public void eatFood(){
		System.out.println("Snake's eatFood");
	}
	
	public boolean isEatBody(){
		System.out.println("Snake's isEatBody");
		return false;
	}
	
	public void drawMe(){
		System.out.println("Snake's drawMe");
	}
	
	private class SnakeDriver implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				move();
				for(SnakeListener l : listeners){
					l.snakeMoved(Snake.this);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
	
	public void start(){
		new Thread(new SnakeDriver()).start();
	}
	
	public void addSnakeListener(SnakeListener l){
		if(l!=null){
			this.listeners.add(l);
		}
	}
	
}
