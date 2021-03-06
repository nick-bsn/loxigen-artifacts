/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */

/****************************************************************
 * File: of_match.h
 *
 * DO NOT EDIT
 *
 * This file is automatically generated
 *
 ****************************************************************/


#if !defined(_OF_MATCH_H_)
#define _OF_MATCH_H_


#include <loci/loci_base.h>
/* Unified, flat OpenFlow match structure based on OF 1.2 */
typedef struct of_match_fields_s {
    /* Version 1.2 is used for field names */
    of_port_no_t         in_port;
    of_port_no_t         in_phy_port;
    uint64_t             metadata;
    of_mac_addr_t        eth_dst;
    of_mac_addr_t        eth_src;
    uint16_t             eth_type;
    uint16_t             vlan_vid;
    uint8_t              vlan_pcp;
    uint8_t              ip_dscp;
    uint8_t              ip_ecn;
    uint8_t              ip_proto;
    of_ipv4_t            ipv4_src;
    of_ipv4_t            ipv4_dst;
    uint16_t             tcp_src;
    uint16_t             tcp_dst;
    uint16_t             udp_src;
    uint16_t             udp_dst;
    uint16_t             sctp_src;
    uint16_t             sctp_dst;
    uint8_t              icmpv4_type;
    uint8_t              icmpv4_code;
    uint16_t             arp_op;
    uint32_t             arp_spa;
    uint32_t             arp_tpa;
    of_mac_addr_t        arp_sha;
    of_mac_addr_t        arp_tha;
    of_ipv6_t            ipv6_src;
    of_ipv6_t            ipv6_dst;
    uint32_t             ipv6_flabel;
    uint8_t              icmpv6_type;
    uint8_t              icmpv6_code;
    of_ipv6_t            ipv6_nd_target;
    of_mac_addr_t        ipv6_nd_sll;
    of_mac_addr_t        ipv6_nd_tll;
    uint32_t             mpls_label;
    uint8_t              mpls_tc;
    uint8_t              mpls_bos;
    uint64_t             tunnel_id;
    uint16_t             ipv6_exthdr;
    uint8_t              pbb_uca;
    of_ipv4_t            tunnel_ipv4_src;
    of_ipv4_t            tunnel_ipv4_dst;
    uint32_t             conn_tracking_state;
    uint16_t             conn_tracking_zone;
    uint32_t             conn_tracking_mark;
    uint128_t            conn_tracking_label;
    uint8_t              conn_tracking_nw_proto;
    uint32_t             conn_tracking_nw_src;
    uint32_t             conn_tracking_nw_dst;
    of_ipv6_t            conn_tracking_ipv6_src;
    of_ipv6_t            conn_tracking_ipv6_dst;
    uint16_t             conn_tracking_tp_src;
    uint16_t             conn_tracking_tp_dst;
    of_bitmap_128_t      bsn_in_ports_128;
    uint32_t             bsn_lag_id;
    uint32_t             bsn_vrf;
    uint8_t              bsn_global_vrf_allowed;
    uint32_t             bsn_l3_interface_class_id;
    uint32_t             bsn_l3_src_class_id;
    uint32_t             bsn_l3_dst_class_id;
    uint32_t             bsn_egr_port_group_id;
    uint32_t             bsn_udf0;
    uint32_t             bsn_udf1;
    uint32_t             bsn_udf2;
    uint32_t             bsn_udf3;
    uint32_t             bsn_udf4;
    uint32_t             bsn_udf5;
    uint32_t             bsn_udf6;
    uint32_t             bsn_udf7;
    uint16_t             bsn_tcp_flags;
    uint32_t             bsn_vlan_xlate_port_group_id;
    uint8_t              bsn_l2_cache_hit;
    of_bitmap_512_t      bsn_in_ports_512;
    uint32_t             bsn_ingress_port_group_id;
    uint32_t             bsn_vxlan_network_id;
    of_mac_addr_t        bsn_inner_eth_dst;
    of_mac_addr_t        bsn_inner_eth_src;
    uint16_t             bsn_inner_vlan_vid;
    uint16_t             bsn_vfi;
    uint8_t              bsn_ip_fragmentation;
    uint32_t             bsn_ifp_class_id;
    uint16_t             ovs_tcp_flags;

} of_match_fields_t;

/**
 * @brief The LOCI match structure.
 */

typedef struct of_match_s {
    of_version_t version;
    of_match_fields_t fields;
    of_match_fields_t masks;
} of_match_t;

/*
 * AND 'len' bytes starting from 'value' with the corresponding byte in
 * 'mask'.
 */
static inline void
of_memmask(void *value, const void *mask, size_t len)
{
    int i;
    uint8_t *v = value;
    const uint8_t *m = mask;

    for (i = 0; i < len; i++) {
        v[i] &= m[i];
    }
}

/**
 * @brief Map from mask to OF 1.0 wildcard
 */

extern int of_ip_mask_to_index(uint32_t mask);

/**
 * @brief Map from OF 1.0 wildcard to mask
 */

extern uint32_t of_ip_index_to_mask(int index);

/**
 * The signalling of an untagged packet varies by OF version.
 * Use this macro to set the field value.
 */
#define OF_MATCH_UNTAGGED_VLAN_ID(version) \
    ((version) == OF_VERSION_1_0 ? 0xffff : \
     ((version) == OF_VERSION_1_1 ? 0xffff : 0))

/**
 * Version 1.1 had the notion of "any" vlan but must be set
 */
#define OF_MATCH_VLAN_TAG_PRESENT_ANY_ID(version) \
    ((version) == OF_VERSION_1_0 ? 0 /* @fixme */  : \
     ((version) == OF_VERSION_1_1 ? 0xfffe : 0x1000))

/**
 * Determine "more specific" relationship between mac addrs
 * @return true if v1 is equal to or more specific than v2
 *
 * @todo Could be optimized
 *
 * Check: Every bit in v2 is set in v1; v1 may have add'l bits set.
 * That is, return false if there is a bit set in v2 and not in v1.
 */

static inline int
of_more_specific_ipv6(of_ipv6_t *v1, of_ipv6_t *v2) {
    int idx;

    for (idx = 0; idx < OF_IPV6_BYTES; idx++) {
        /* If there's a bit set in v2 that is clear in v1, return false */
        if (~v1->addr[idx] & v2->addr[idx]) {
            return 0;
        }
    }

    return 1;
}

/**
 * Boolean test if two values agree when restricted to a mask
 */

static inline int
of_restricted_match_ipv6(of_ipv6_t *v1, of_ipv6_t *v2, of_ipv6_t *mask) {
    int idx;

    for (idx = 0; idx < OF_IPV6_BYTES; idx++) {
        if ((v1->addr[idx] & mask->addr[idx]) !=
               (v2->addr[idx] & mask->addr[idx])) {
            return 0;
        }
    }

    return 1;
}

/**
 * Boolean test if two values "overlap" (agree on common masks)
 */

static inline int
of_overlap_ipv6(of_ipv6_t *v1, of_ipv6_t *v2,
                         of_ipv6_t *m1, of_ipv6_t *m2) {
    int idx;

    for (idx = 0; idx < OF_IPV6_BYTES; idx++) {
        if (((v1->addr[idx] & m1->addr[idx]) & m2->addr[idx]) !=
               ((v2->addr[idx] & m1->addr[idx]) & m2->addr[idx])) {
            return 0;
        }
    }

    return 1;
}

#define OF_MORE_SPECIFIC_IPV6(v1, v2) of_more_specific_ipv6((v1), (v2))

#define OF_RESTRICTED_MATCH_IPV6(v1, v2, mask) \
    of_restricted_match_ipv6((v1), (v2), (mask))

#define OF_OVERLAP_IPV6(v1, v2, m1, m2) of_overlap_ipv6((v1), (v2), (m1), (m2))

/**
 * Determine "more specific" relationship between mac addrs
 * @return true if v1 is equal to or more specific than v2
 *
 * @todo Could be optimized
 *
 * Check: Every bit in v2 is set in v1; v1 may have add'l bits set.
 * That is, return false if there is a bit set in v2 and not in v1.
 */
static inline int
of_more_specific_mac_addr(of_mac_addr_t *v1, of_mac_addr_t *v2) {
    int idx;

    for (idx = 0; idx < OF_MAC_ADDR_BYTES; idx++) {
        /* If there's a bit set in v2 that is clear in v1, return false */
        if (~v1->addr[idx] & v2->addr[idx]) {
            return 0;
        }
    }

    return 1;
}

/**
 * Boolean test if two values agree when restricted to a mask
 */
static inline int
of_restricted_match_mac_addr(of_mac_addr_t *v1, of_mac_addr_t *v2,
                             of_mac_addr_t *mask) {
    int idx;

    for (idx = 0; idx < OF_MAC_ADDR_BYTES; idx++) {
        if ((v1->addr[idx] & mask->addr[idx]) !=
               (v2->addr[idx] & mask->addr[idx])) {
            return 0;
        }
    }

    return 1;
}

/**
 * Boolean test if two values "overlap" (agree on common masks)
 */

static inline int
of_overlap_mac_addr(of_mac_addr_t *v1, of_mac_addr_t *v2,
                         of_mac_addr_t *m1, of_mac_addr_t *m2) {
    int idx;

    for (idx = 0; idx < OF_MAC_ADDR_BYTES; idx++) {
        if (((v1->addr[idx] & m1->addr[idx]) & m2->addr[idx]) !=
               ((v2->addr[idx] & m1->addr[idx]) & m2->addr[idx])) {
            return 0;
        }
    }

    return 1;
}

#define OF_MORE_SPECIFIC_MAC_ADDR(v1, v2) of_more_specific_mac_addr((v1), (v2))

#define OF_RESTRICTED_MATCH_MAC_ADDR(v1, v2, mask) \
    of_restricted_match_mac_addr((v1), (v2), (mask))

#define OF_OVERLAP_MAC_ADDR(v1, v2, m1, m2) \
    of_overlap_mac_addr((v1), (v2), (m1), (m2))

#define OF_MORE_SPECIFIC_BITMAP_128(v1, v2) \
    (OF_MORE_SPECIFIC_INT((v1)->lo, (v2)->lo) && OF_MORE_SPECIFIC_INT((v1)->hi, (v2)->hi))

#define OF_RESTRICTED_MATCH_BITMAP_128(v1, v2, mask) \
    (OF_RESTRICTED_MATCH_INT((v1)->lo, (v2)->lo, (mask)->lo) && OF_RESTRICTED_MATCH_INT((v1)->hi, (v2)->hi, (mask)->hi))

#define OF_OVERLAP_BITMAP_128(v1, v2, m1, m2) \
    (OF_OVERLAP_INT((v1)->lo, (v2)->lo, (m1)->lo, (m2)->lo) && OF_OVERLAP_INT((v1)->hi, (v2)->hi, (m1)->hi, (m2)->hi))

/**
 * More-specific-than macro for integer types; see above
 * @return true if v1 is equal to or more specific than v2
 *
 * If there is a bit that is set in v2 and not in v1, return false.
 */
#define OF_MORE_SPECIFIC_INT(v1, v2) (!(~(v1) & (v2)))

/**
 * Boolean test if two values agree when restricted to a mask
 */
#define OF_RESTRICTED_MATCH_INT(v1, v2, mask) \
   (((v1) & (mask)) == ((v2) & (mask)))


#define OF_OVERLAP_INT(v1, v2, m1, m2) \
    ((((v1) & (m1)) & (m2)) == (((v2) & (m1)) & (m2)))

/**
 * Compare two match structures for exact equality
 *
 * We just do memcmp assuming structs were memset to 0 on init
 */
static inline int
of_match_eq(of_match_t *match1, of_match_t *match2)
{
    return (MEMCMP(match1, match2, sizeof(of_match_t)) == 0);
}

/**
 * Is the entry match more specific than (or equal to) the query match?
 * @param entry Match expected to be more specific (subset of query)
 * @param query Match expected to be less specific (superset of entry)
 * @returns Boolean, see below
 *
 * The assumption is that a query is being done for a non-strict
 * match against an entry in a table.  The result is true if the
 * entry match indicates a more specific (but compatible) flow space
 * specification than that in the query match.  This means that the
 * values agree between the two where they overlap, and that each mask
 * for the entry is more specific than that of the query.
 *
 * The query has the less specific mask (fewer mask bits) so it is
 * used for the mask when checking values.
 */

static inline int
of_match_more_specific(const of_match_t *entry, const of_match_t *query)
{
    LOCI_ASSERT(sizeof(of_match_fields_t) % sizeof(uint8_t) == 0);

    /* Short hand for masks, fields */
    const uint8_t *qm = (const uint8_t *)&query->masks;
    const uint8_t *em = (const uint8_t *)&entry->masks;
    const uint8_t *qf = (const uint8_t *)&query->fields;
    const uint8_t *ef = (const uint8_t *)&entry->fields;

    int i;
    for (i = 0; i < sizeof(of_match_fields_t)/sizeof(uint8_t); i++) {
        if (qm[i] & ~em[i]) {
            /* Query mask has a bit set that isn't set in the entry mask */
            return 0;
        }

        if ((qf[i] ^ ef[i]) & qm[i]) {
            /* Query and entry disagree on a field bit */
            return 0;
        }
    }

    return 1;
}

/**
 * Do two entries overlap?
 * @param match1 One match struct
 * @param match2 Another match struct
 * @returns Boolean: true if there is a packet that would match both
 *
 */

static inline int
of_match_overlap(const of_match_t *match1, const of_match_t *match2)
{
    LOCI_ASSERT(sizeof(of_match_fields_t) % sizeof(uint8_t) == 0);

    /* Short hand for masks, fields */
    const uint8_t *m1 = (const uint8_t *)&match1->masks;
    const uint8_t *m2 = (const uint8_t *)&match2->masks;
    const uint8_t *f1 = (const uint8_t *)&match1->fields;
    const uint8_t *f2 = (const uint8_t *)&match2->fields;

    int i;
    for (i = 0; i < sizeof(of_match_fields_t)/sizeof(uint8_t); i++) {
        if ((f1[i] ^ f2[i]) & (m1[i] & m2[i])) {
            /* Matches disagree on a field bit they both qualify on */
            return 0;
        }
    }

    return 1; /* No field differentiates matches */
}

#endif /* Match header file */
