NAME  = aula
SHELL = bash
PWD   = $(shell pwd)

all: text clean

clean:
	rm -f *.{acn,acr,alg,aux,bbl,blg,fls,glg,glo,gls,glsdefs,hd,idx,ilg,ind,ins,ist,log,loa,loe,lof,lot,mw,nav,out,sbl,snm,sym,toc,vrb,xdy,fdb_latexmk,gz}

text:
	# Works on El Captain
	# "/Library/TeX/texbin/pdflatex" -synctex=1 -interaction=nonstopmode --shell-escape $(NAME).tex
	"/Library/TeX/texbin/xelatex" -synctex=1 -interaction=nonstopmode --shell-escape $(NAME).tex
	#"/Library/TeX/texbin/bibtex" $(NAME).aux
	"/Library/TeX/texbin/xelatex" -synctex=1 -interaction=nonstopmode --shell-escape $(NAME).tex
	"/Library/TeX/texbin/xelatex" -synctex=1 -interaction=nonstopmode --shell-escape $(NAME).tex
	#test -e $(NAME).pdf && mv $(NAME).pdf 03-MVC.pdf
