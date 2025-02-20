#@TYPE: SOC
#@NAME: SpacemiT K1
#@SOC: SpacemiT K1
#@DESCRIPTION: Common config for boards based on the SpacemiT K1

require spacemit-k1.inc

#============================================
# Common Preferred Providers
PREFERRED_PROVIDER_virtual/kernel ?= "linux-bananapi-bpi-f3-dev"
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot-spacemit"
PREFERRED_PROVIDER_virtual/libgl ?= "mesa-pvr"
PREFERRED_PROVIDER_virtual/libglx ?= "mesa-pvr"
PREFERRED_PROVIDER_virtual/mesa ?= "mesa-pvr"
PREFERRED_PROVIDER_virtual/libgbm ?= "mesa-pvr"
PREFERRED_PROVIDER_virtual/egl ?= "mesa-pvr"
PREFERRED_PROVIDER_virtual/libgles3 ?= "visionfive2-pvr-graphics"
PREFERRED_PROVIDER_virtual/libgles1 ?= "visionfive2-pvr-graphics"
PREFERRED_PROVIDER_virtual/libgles2 ?= "visionfive2-pvr-graphics"
PREFERRED_PROVIDER_virtual/libomxil ?= "libsf-omxil"
#============================================

#============================================
# Common Machine Configuration
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS += " \
"
#============================================

#============================================
# Common Kernel Configuration
KERNEL_MODULE_AUTOLOAD += "pvrsrvkm"
#============================================

#============================================
# Common Uboot Configuration
EXTRA_IMAGEDEPENDS += "u-boot-spacemit"
UBOOT_ENTRYPOINT = "0x40200000"
UBOOT_DTB_LOADADDRESS = "0x46000000"
UBOOT_RD_LOADADDRESS = "0x46100000"
UBOOT_DTB = "1"
#UBOOT_ENV = "u-boot-env-default"
#UBOOT_ENV_SUFFIX = "bin"
SPL_BINARY = "spl/u-boot-spl.bin"
SPL_NORMAL_BINARY = "u-boot-spl.bin.normal.out"
#============================================

#============================================
# Common Image Configuration
#IMAGE_BOOT_FILES = " \
#"
#WKS_FILE ?= "bananapi-bpi-f3.wks"
#============================================
