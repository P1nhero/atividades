# -*- coding: utf-8 -*-
"""Untitled6.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1ySKsh1HriSANMLjeCRiICSvau3ptN5_p
"""

#Biblioteca
import numpy as np
import matplotlib.pyplot as plt
import urllib.request
from PIL import Image

#Copie a URl da uma imagem qualquer da Intenet
urllib.request.urlretrieve('https://staticg.sportskeeda.com/editor/2024/01/e0b32-17061405508835-1920.jpg?w=640', 'imagem.jpg')
# salvando a imagem em uma varialvel
imagem_RGB = plt.imread("imagem.jpg")
#Mostra a imagem
plt.figure(1)
plt.imshow(imagem_RGB)

"""#Biblioteca
import numpy as np
import matplotlib.pyplot as plt
import urllib.request # this imports the submodule 'request' within 'urllib'
from PIL import Image

# ... (rest of your code) ...

#Copie a URl da uma imagem qualquer da Intenet
urllib.request.urlretrieve('https://static.vecteezy.com/ti/fotos-gratis/t2/36324708-ai-gerado-cenario-do-uma-tigre-caminhando-dentro-a-floresta-foto', 'imagem.jpg')
# ...
"""