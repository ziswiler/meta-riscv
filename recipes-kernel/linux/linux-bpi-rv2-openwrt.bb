require linux-mainline-common.inc
FILESEXTRAPATHS =. "${FILE_DIRNAME}/linux-bpi-rv2-openwrt:"

SUMMARY = "Banana Pi BPI-RV2 OpenWrt Linux Kernel"

inherit kernel

DEPENDS = "u-boot-mkimage-native dtc-native"

BRANCH = "linux-6.12.y"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=https;branch=${BRANCH} \
           file://0001-clk-add-drivers-for-siflower-socs.patch \
           file://0002-reset-add-support-for-sf19a2890.patch \
           file://0003-gpio-add-support-for-siflower-socs.patch \
           file://0004-pinctrl-add-driver-for-siflower-sf19a2890.patch \
           file://0005-stmmac-add-support-for-sf19a2890.patch \
           file://0006-phy-add-support-for-Siflower-USB-PHYs.patch \
           file://0007-usb-dwc2-add-support-for-Siflower-SF19A2890.patch \
           file://0008-usb-dwc2-handle-OTG-interrupt-regardless-of-GINTSTS.patch \
           file://0009-riscv-add-Siflower-RISC-V-SoC-family-Kconfig-support.patch \
           file://0010-reset-add-support-for-sf21a6826-sf21h8898.patch \
           file://0011-spi-spi-mem-allow-gpio-cs-in-spi_mem_exec_op.patch \
           file://0012-spi-add-support-for-sf21-qspi.patch \
           file://0013-pci-dw-pcie-add-support-for-sf21-pcie.patch \
           file://0014-net-phy-add-support-for-Siflower-SF23P1211-SF23P1240.patch \
           file://0015-net-ethernet-add-support-for-Siflower-DPNS.patch \
           file://0016-Add-siflower-risc-v-drivers-from-openwrt.patch \
           file://0017-Add-siflower-risc-v-dtbindings-includes-from-openwrt.patch \
           file://0018-Add-siflower-risc-v-device-trees-from-openwrt.patch \
           file://bpi-rv2-openwrt_defconfig \
"

SRCREV ?= "abf529abd660d8ccad46dd8c8f20e93db6134f5f"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION ?= "6.12.67"

KERNEL_DANGLING_FEATURES_WARN_ONLY = "1"

COMPATIBLE_MACHINE = "(bananapi-rv2)"
