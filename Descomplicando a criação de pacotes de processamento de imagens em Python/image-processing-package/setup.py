from setuptools import setup, find_packages

with open("README.md", "r") as f:
    page_description = f.read()

with open("requirements.txt") as f:
    requirements = f.read().splitlines()

setup(
    name="image_processing",
    version="0.0.1",
    author="Texugo-928",
    author_email="junior-cmf@live.com",
    description="Image Processing Package using Skimage",
    long_description=page_description,
    long_description_content_type="text/markdown",
    url="https://github.com/Texugo-928/DIO/Descomplicando a criação de pacotes de processamento de imagens em Python/image-processing-package"
    packages=find_packages(),
    install_requires=requirements,
    python_requires='>=3.5',
)