package com.pabo.SWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Fillayoutsampple {

	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display,SWT.SHELL_TRIM);
		
		FillLayout layout=new FillLayout();
		//layout.type=SWT.HORIZONTAL;
		layout.type=SWT.VERTICAL;
		shell.setLayout(layout);
		
		new Button(shell, SWT.NONE).setText("B1");
		
		new Button(shell, SWT.NONE).setText("B2");
		
		new Button(shell, SWT.NONE).setText("B3");
		
		shell.layout();
		shell.pack();
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
			
		}
		display.dispose();
		
		

	}

}
