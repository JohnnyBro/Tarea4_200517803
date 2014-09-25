package gt.edu.usac.ipc1a.objects;

import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle{
	int d=0;
	Color color;
	public WallJump(){

		size = 100;
		gravity = 0.3f;
		
	}
	

	 //aplicando los cambios
	public void AplicarGravedad(){
		//utilizando el metodo AplicarGravedad para el eje X

		if(d==0){
			velocityX += gravity;
			color=Color.green;

		}else{
			velocityX -= gravity;
			color=Color.yellow;
		}

	}

	@Override
	public void DetectarSuelo()
	{
		//aplicando el metodo DetectarSuelo para detectar muro.
		if(positionX +size > 800)
		{
			d=1;
		}else if(positionX<0){
			d=0;
		}
	}



	@Override
	public void Draw (Graphics g){		 
		g.setColor(color);
		g.fillOval(positionX,positionY,size,size);
	}

}