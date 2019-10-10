from tkinter import *

def retrive_input():
    #input = self.Text_Box.get(1.0, END)
    print("test")

def btn_press(num) :
    print("test")


window = Tk()
window.title("Test tilte")
window.geometry("300x400")

Text_Box = Listbox(window)


number_btns = Frame(window)
number_btns.

btn_1 = Button(number_btns, text=" 1 ")
btn_1.grid(column=1, row=1)

btn_2 = Button(number_btns, text=" 2 ")
btn_2.grid(column=2, row=1)

btn_3 = Button(number_btns, text=" 3 ")
btn_3.grid(column=3, row=1)

btn_4 = Button(number_btns, text=" 4 ")
btn_4.grid(column=1, row=2)

btn_5 = Button(number_btns, text=" 5 ")
btn_5.grid(column=2, row=2)

btn_6 = Button(number_btns, text=" 6 ")
btn_6.grid(column=3, row=2)

btn_7 = Button(number_btns, text=" 7 ")
btn_7.grid(column=1, row=3)

btn_8 = Button(number_btns, text=" 8 ")
btn_8.grid(column=2, row=3)

btn_9 = Button(number_btns, text=" 9 ")
btn_9.grid(column=3, row=3)


window.mainloop()
